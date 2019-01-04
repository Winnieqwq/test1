package com.oaec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.oaec.interceptor.LoginInterceptor;
@Configuration
public class InterceptorConfig implements WebMvcConfigurer{

	@Autowired
	private  LoginInterceptor li;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(li).addPathPatterns("/**").excludePathPatterns("/index.do");
	}
	

}
