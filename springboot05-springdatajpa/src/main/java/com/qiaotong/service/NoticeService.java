package com.qiaotong.service;

import java.util.List;

import com.qiaotong.entity.Notice;

public interface NoticeService {
	/**
	 * 查询所有公告
	 */
	public List<Notice> findAll();
}
