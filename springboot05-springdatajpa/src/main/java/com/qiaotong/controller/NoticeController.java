package com.qiaotong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qiaotong.entity.Notice;
import com.qiaotong.service.NoticeService;

@RestController
public class NoticeController {
	// 注入NoticeSerivce
	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("/findAll")
	public List<Notice> findAll() {
		return noticeService.findAll();
	}
}
