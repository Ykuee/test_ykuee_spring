package com.ykuee.test.strapconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("com.ykuee.test")
@PropertySource("classpath:test.properties")
@EnableAspectJAutoProxy
public class StrapConfigBean {

	@Bean
	public StrapService strapService() {
		return new StrapService();
	}
	
	@Bean
	public UseStrapService useStrapService() {
		UseStrapService useStrapService = new UseStrapService();
		useStrapService.setStrapService(strapService());
		return useStrapService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	/*
	@Bean
	public UseStrapService useStrapService(StrapService strapService) {
		UseStrapService useStrapService = new UseStrapService();
		useStrapService.setStrapService(strapService);
		return useStrapService;
	}*/
	
}
