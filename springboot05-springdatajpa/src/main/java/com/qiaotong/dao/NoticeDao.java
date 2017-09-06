package com.qiaotong.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qiaotong.entity.Notice;

@Repository
public interface NoticeDao extends JpaRepository<Notice, Long> {
}
