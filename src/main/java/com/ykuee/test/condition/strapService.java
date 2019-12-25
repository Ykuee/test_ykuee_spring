package com.ykuee.test.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class strapService {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
		OsService service = context.getBean(OsService.class);
		service.doservice();
	}
}
