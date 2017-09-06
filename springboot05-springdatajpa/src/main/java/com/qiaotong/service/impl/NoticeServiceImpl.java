package com.qiaotong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qiaotong.dao.NoticeDao;
import com.qiaotong.entity.Notice;
import com.qiaotong.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {
	// 注入NoticeDao
	@Autowired
	private NoticeDao noticeDao;
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

}
