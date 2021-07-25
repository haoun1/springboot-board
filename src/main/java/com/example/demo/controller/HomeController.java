package com.example.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.BoardService;
import com.example.demo.service.UserService;
 

@Controller
public class HomeController {
	private BoardService bService;
	private UserService uService;
	
	public HomeController(BoardService b,UserService u) {
		this.bService=b;
		this.uService=u;
	}
	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping(value="/register" , method=RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("check",1);
		return "register";
	}
	@PostMapping(value="/register")
	public String register(Model model, UserDto user) {
		model.addAttribute("check", 2);
		if(uService.join(user))
			model.addAttribute("msg","회원가입이 완료되었습니다.");
		else
		{model.addAttribute("msg","중복된 아이디가 존재합니다");}
			return "register";
	}
	@RequestMapping("/select")
	public String select(Model model) {
		List<BoardDto> boardList=bService.getBoardList();
		model.addAttribute("postList",boardList);
		return "select";
	}
	@RequestMapping("/write")
	public String write(Model model) {
		return "write";
	}
	@RequestMapping("/delete")
	public String delete(Model model) {
		return "delete";
	}
	@RequestMapping("/withdraw")
	public String withdraw(Model model) {
		return "withdraw";
	}
	@PostMapping(value="/withdraw")
	public String withdraw(UserDto user) {
		uService.withdraw(user.getUserId(), user.getUserPw());
		return "withdraw";
	}
	@RequestMapping("/user")
	public String user(Model model) {
		List<UserDto> userList=uService.getUserList();
		model.addAttribute("userList", userList);
		return "user";
	}
	
}
