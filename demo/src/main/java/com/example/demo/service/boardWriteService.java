package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDao;

@Service
public class boardWriteService {
	
	@Autowired
	private IDao iDao;
	
	public void boardSave(String title, String name, String contents) {
		
	iDao.boardSave(name, title, contents);
		
		
		
	}


}
