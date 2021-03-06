package com.example.demo.di;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class PathGallProvider implements ApplicationContextAware {

	
	ApplicationContext context;
	
	
	
	public ApplicationContext getContext() {
		return context;
	}



	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		context = applicationContext;
		System.out.println("setApplicationContext() 실행");

	}

}
