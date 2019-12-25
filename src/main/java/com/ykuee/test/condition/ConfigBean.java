package com.ykuee.test.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ykuee.test.condition")
public class ConfigBean {

	@Bean
	@Conditional(WindowsCondition.class)
	public OsService getWinService() {
		return new WindowsOsService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public OsService getLinService() {
		return new LinuxOsService();
	}
}
