package com.example.sample.controller;

import com.example.sample.common.codes.ApiResponse;
import com.example.sample.common.codes.SuccessCode;
import com.example.sample.common.utils.TokenUtils;
import com.example.sample.constants.AuthConstants;
import com.example.sample.service.TieRsltPickWcsRRepository;
import com.example.sample.vo.UserVO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test")
public class TestController {

    private final TieRsltPickWcsRRepository tieRsltPickWcsRRepository;


    /**
     * [API] 사용자 정보를 기반으로 JWT를 발급하는 API
     *
     * @param userVO UserVO
     * @return ApiResponseWrapper<ApiResponse> : 응답 결과 및 응답 코드 반환
     */
    @PostMapping("/generateToken")
    @Operation(summary = "토큰 발급", description = "사용자 정보를 기반으로 JWT를 발급하는 API")
    public ResponseEntity<ApiResponse> selectCodeList(@RequestBody UserVO userVO) {

        String resultToken = TokenUtils.generateJwtToken(userVO);

        ApiResponse ar = ApiResponse.builder()
                // BEARER {토큰} 형태로 반환을 해줍니다.
                .result(AuthConstants.TOKEN_TYPE + " " + resultToken)
                .resultCode(SuccessCode.SELECT.getStatus())
                .resultMsg(SuccessCode.SELECT.getMessage())
                .build();

        return new ResponseEntity<>(ar, HttpStatus.OK);
    }

/*
    @PostMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test(){

        TieRsltPickWcsRVO memo = TieRsltPickWcsRVO.builder()
                .if_no(1)
                .if_stat("N")
                .center_cd("TEST")
                .ord_no("123")
                .ord_line_no("456")
                .sku_qty(0)
                .reg_ymd("20230905")
                .build();
        //Create!
       tieRsltPickWcsRRepository.save(memo);

        return new ResponseEntity<>(HttpStatus.OK);
    }*/
}
