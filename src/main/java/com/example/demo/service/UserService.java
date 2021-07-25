package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.UserDto;

public interface UserService {
	public boolean login (String userId, String userPw);
	public boolean join (UserDto user);
	public void modify(UserDto user);
	public void withdraw(String userId, String userPw);
	public UserDto getUser(String userId);
	public List<UserDto> getUserList();
}
