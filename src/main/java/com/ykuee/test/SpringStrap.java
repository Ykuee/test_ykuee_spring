package com.ykuee.test;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ykuee.test.event.TestEvent;
import com.ykuee.test.event.TestPublisher;
import com.ykuee.test.service.TestAOPAnnotationService;
import com.ykuee.test.service.TestAOPMethodService;
import com.ykuee.test.service.TestELService;
import com.ykuee.test.strapconfig.StrapConfigBean;
import com.ykuee.test.strapconfig.UseStrapService;

public class SpringStrap {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StrapConfigBean.class);
		UseStrapService service = context.getBean(UseStrapService.class);
		System.out.println(service.doService("OK"));
		TestAOPAnnotationService aopAnn = context.getBean(TestAOPAnnotationService.class);
		TestAOPAnnotationService aopAnn2 = context.getBean(TestAOPAnnotationService.class);
		TestAOPMethodService aopMethod = context.getBean(TestAOPMethodService.class);
		TestELService testService = context.getBean(TestELService.class);
		aopAnn.add("MAIN");
		System.out.println("单例测试：两个类是否相等 "+aopAnn.equals(aopAnn2));
		aopMethod.add();
		System.out.println(testService.testString);
		System.out.println(testService.osName);
		System.out.println(testService.system);
		System.out.println(testService.testNumber);
		System.out.println(testService.fromObject);
		//testService.readFile();
		System.out.println(testService.myName);
		System.out.println(testService.environment.getProperty("myname"));
		
		TestPublisher publisher = context.getBean(TestPublisher.class);
		publisher.publish("Event Ykuee");
		context.close();
	}
	
}
