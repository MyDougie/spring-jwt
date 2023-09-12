package com.example.sample.mapper;

import com.example.sample.vo.UserVO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserMapper {

    Optional<UserVO> login(UserVO userVO);

    List<UserVO> selectUserList(UserVO userVO);

}