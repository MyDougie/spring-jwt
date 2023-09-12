package com.example.sample.controller;

import com.example.sample.common.codes.ApiResponse;
import com.example.sample.common.codes.SuccessCode;
import com.example.sample.service.UserService;
import com.example.sample.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * [View] 로그인 페이지를 엽니다.
     *
     * @param model Model
     * @return ApiResponseWrapper<ApiResponse> : 응답 결과 및 응답 코드 반환
     */
    @PostMapping("/login")
    public String login(Model model) {
        log.info("login called()");

        return "pages/login/loginPage";
    }

    /**
     * [API] 사용자 리스트 조회
     *
     * @param userVO UserVO
     * @return ResponseEntity
     */
    @PostMapping("/user")
    public ResponseEntity<ApiResponse<Object>> selectUserList(@RequestBody UserVO userVO) {
        List<UserVO> selectUserList = userService.selectUserList(userVO);
        log.info("selectUserList : {}", selectUserList.toString());
        ApiResponse<Object> ar = ApiResponse.builder()
                .result(selectUserList)
                .resultCode(SuccessCode.SELECT.getStatus())
                .resultMsg(SuccessCode.SELECT.getMessage())
                .build();

        return new ResponseEntity<>(ar, HttpStatus.OK);
    }
}