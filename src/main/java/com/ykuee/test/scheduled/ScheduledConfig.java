package com.ykuee.test.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.ykuee.test.scheduled")
@EnableScheduling
public class ScheduledConfig {

}
