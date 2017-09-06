package com.qiaotong;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 此类是作为web.xml文件的使用
 * @author dell
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		System.out.println("===========ServletInitializer=============");
		// 这只启动类
		builder.sources(Application.class);
		builder.bannerMode(Mode.OFF);
		return builder;
	}

}
