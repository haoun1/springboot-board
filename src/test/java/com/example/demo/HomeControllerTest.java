/*package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.example.demo.controller.HomeController;





public class HomeControllerTest {
	
private MockMvc mockMvc;//실제로 서버에 배포하지 않고서도 SpringMVC를 실행하는 클래스

@BeforeEach //Test를 위한 전작업
public void setUp() {
this.mockMvc = MockMvcBuilders.standaloneSetup(
new HomeController()).build();}//테스트하기 원하는 원래 컨트롤러를 mockMVC의 객체로 등록

private ViewResolver viewResolver() {
	InternalResourceViewResolver viewResolver =
	new InternalResourceViewResolver();
	viewResolver.setViewClass(JstlView.class);
	viewResolver.setPrefix("/WEB-INF/views/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
}

@Test
public void testWelcomeView() throws Exception {
	this.mockMvc.perform(
	get("/welcome-view")
	.accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
	.andExpect(view().name("index"));
}

}*/