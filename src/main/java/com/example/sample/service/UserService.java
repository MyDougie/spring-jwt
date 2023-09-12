package com.example.sample.service;

import com.example.sample.vo.UserVO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<UserVO> login(UserVO userVo);

    List<UserVO> selectUserList(UserVO userVO);
}