package com.ykuee.test.scheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class strapService {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledConfig.class);
		//context.getBean("SchedyuledService");
	}
}
