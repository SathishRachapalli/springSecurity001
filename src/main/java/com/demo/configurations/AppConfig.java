package com.demo.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com")
public class AppConfig {
	
	@Bean
	InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewObj = new InternalResourceViewResolver();
		viewObj.setPrefix("/WEB-INF/views/");
		viewObj.setSuffix(".jsp");
		return viewObj;
	}

}
