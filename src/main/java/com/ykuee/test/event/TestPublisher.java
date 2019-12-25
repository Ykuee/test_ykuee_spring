package com.ykuee.test.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestPublisher {

	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		applicationContext.publishEvent(new TestEvent(this, msg));
	}
}
