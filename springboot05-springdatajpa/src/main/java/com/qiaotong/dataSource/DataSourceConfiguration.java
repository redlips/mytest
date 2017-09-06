package com.qiaotong.dataSource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataSourceConfiguration {
	@Bean(name="dataSource")
	@Primary
	@ConfigurationProperties(prefix="spring.datasource.c3p0")
	public DataSource getDataSource() {
		System.out.println("自定义的连接池开启了");
		// 创建数据源构建对象
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
