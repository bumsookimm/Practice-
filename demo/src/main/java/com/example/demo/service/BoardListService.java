package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.example.demo.dao.IDao;
import com.example.demo.dto.BoardDto;

@Service
public class BoardListService {
	
	@Autowired
	private IDao iDao;
	
	
	public void boardList(int page, Model model) {
		int pageSize = 10;
		int offset = (page - 1) * pageSize;
		
		int totalCount = iDao.boardTotalCount();
		int totalPage =(int)Math.ceil((double)totalCount / pageSize);
		
		List<BoardDto> boardDto = iDao.boardListPaging(pageSize, offset);
		
		model.addAttribute("boardDto", boardDto);
		model.addAttribute("currentPage", page);
		model.addAttribute("totalPage", totalPage);
		
	
		
	}
		
}
