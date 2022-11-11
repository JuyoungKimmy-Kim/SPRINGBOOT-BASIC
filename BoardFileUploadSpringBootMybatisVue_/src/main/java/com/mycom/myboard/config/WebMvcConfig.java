package com.mycom.myboard.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mycom.myboard.common.LoginInterceptor;

@Configuration 
public class WebMvcConfig implements WebMvcConfigurer {
	@Autowired
	private LoginInterceptor logininterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
		.addInterceptor(logininterceptor)
		.addPathPatterns("/**")
		.excludePathPatterns("/", "/index.html","favicon.ico")
		.excludePathPatterns("/login/**", "/css/**", "/js/**", "/img/**");
	}
}
