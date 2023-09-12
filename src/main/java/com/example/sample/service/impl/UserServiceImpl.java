package com.example.sample.service.impl;

import com.example.sample.service.UserService;
import com.example.sample.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import com.example.sample.mapper.UserMapper;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final SqlSession sqlSession;

    public UserServiceImpl(SqlSession ss) {
        this.sqlSession = ss;
    }

    /**
     * 로그인 구현체
     *
     * @param userVO UserVO
     * @return Optional<UserVO>
     */
    @Override
    public Optional<UserVO> login(UserVO userVO) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.login(userVO);
    }

    @Override
    public List<UserVO> selectUserList(UserVO userVO) {
        UserMapper um = sqlSession.getMapper(UserMapper.class);
        return um.selectUserList(userVO);
    }
}