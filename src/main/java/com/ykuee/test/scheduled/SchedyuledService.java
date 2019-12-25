package com.ykuee.test.scheduled;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedyuledService {

	@Scheduled(fixedRate=1)
	public void testScheduled() {
		System.out.println("执行任务:"+new Date());
	}
}
