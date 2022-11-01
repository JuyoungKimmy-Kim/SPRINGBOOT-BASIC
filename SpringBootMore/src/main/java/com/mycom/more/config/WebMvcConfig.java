package com.mycom.more.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mycom.more.common.TestInterceptor;

@Configuration // xml 설정을 대신 <- servlet-context.xml 의 설정 내용을 대체, interceptor 외에 다른 많은 설정 필요
public class WebMvcConfig implements WebMvcConfigurer {
	// interceptor 대한 정책
	// interceptor 객체 DI

	@Autowired
	private TestInterceptor testInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry
		.addInterceptor(testInterceptor)
		.addPathPatterns("/users/**")
		.excludePathPatterns("/login/**");
	}
}
