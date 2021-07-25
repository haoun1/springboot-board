package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import com.example.demo.dto.BoardDto;

public interface BoardService {
	public void write(BoardDto board);
	public void modify(BoardDto board);
	public void remove(int num);
	public BoardDto getBoard(int num);
	public List<BoardDto> getBoardList();
	public List<BoardDto> getBoardSearchList(HashMap<String,Object> params);
}
