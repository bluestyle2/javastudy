package com.example.demo.di;

import javax.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer {

	@Resource
	MyIntercep inter;

	@Resource
	AdminInterceptor admin;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		System.out.println("MyConfig. addInterceptors() 실행");
		
		//모든애들에게 인터셉트가 걸립니다.
		//registry.addInterceptor(inter)
		
		
		registry.addInterceptor(inter)
		.addPathPatterns("/interceptor/**");
						//특정 애만 인터셉트 걸리도록(interceptor/로 시작하는 1단계 아이들은 다 걸림)
		
		
		registry.addInterceptor(admin)
		.addPathPatterns("/admin/**");
						//특정 애만 걸리도록(admin/으로 시작하는 아이들만 다 걸림
	}
}
