package com.example.demo.dto;
import java.util.Date;

public class BoardDto {
 private int num;
 private String title;
 private String content;
 private String writer;
 private String password;
 private Date writeDate;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Date getWriteDate() {
	return writeDate;
}
public void setWriteDate(Date writeDate) {
	this.writeDate = writeDate;
}
public String toString() {
    return "BoardDto [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer
            + ", password=" + password + ", writeDate=" + writeDate + "]";
}
 
}
