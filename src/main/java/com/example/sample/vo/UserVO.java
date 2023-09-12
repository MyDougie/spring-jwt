package com.example.sample.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {

    private String userId;

    private String userNm;

    private String userPw;

    private Integer userSq;

    // 사용자 상태
    private String userSt = "S";

}
