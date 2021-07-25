package com.example.demo;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.dto.BoardDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.service.BoardService;
@SpringBootApplication
public class HaounApplication {
 

    private UserService uService;
    private BoardService bService;
    
    public void userTest() 
    {
        UserDto user = new UserDto();
        user.setUserId("test2");
        user.setUserPw("test2");
        user.setUserName("테스트2");
        user.setUserGender("남");
        user.setUserEmail("test2@test2.test");
        uService.join(user);
        System.out.println(uService.getUser("test2"));
        System.out.println("로그인 결과:"+uService.login("test2", "test2"));
        
    }

    public void boardTest() {
        BoardDto board = new BoardDto();
        board.setNum(1972);
        board.setPassword("9596");
        board.setContent("학식먹을까 배달먹을까");
        board.setTitle("고민");
        bService.write(board);
        
        for(BoardDto b : bService.getBoardList())
        	System.out.println(b);
    }
    
   public static void main(String[] args) throws Exception{
    	SpringApplication.run(HaounApplication.class, args);
    }
    
}

