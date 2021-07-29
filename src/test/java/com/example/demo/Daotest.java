package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.dto.UserDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class Daotest {
    @Autowired
    private UserMapper uMapper;
    @Test
    public void userTest(){
        UserDto user = new UserDto();
        user.setUserId("halee3");
        user.setUserPw("1234");
        user.setUserName("이하운");
        user.setUserEmail("abcd");
        user.setUserGender("남");
        uMapper.insertUser(user);
    }
}
