package com.ykuee.test.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class TestLinstener implements ApplicationListener<TestEvent>{

	@Override
	public void onApplicationEvent(TestEvent event) {
		// TODO Auto-generated method stub
		String msg = event.getMsg();
		System.out.println("已经监听到来自TestEvent的消息："+msg);
	}

}
