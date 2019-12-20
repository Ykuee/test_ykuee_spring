package com.ykuee.test.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestELService {

	@Value("TestString")
	public String testString;
	
	@Value("#{systemProperties['os.name'].toUpperCase()}")
	public String osName;
	
	@Value("#{systemProperties}")
	public Properties system;
	
	@Value("#{T(java.lang.Math).random()}")
	public double testNumber;
	
	@Value("#{testAOPMethodService.test}")//字段必须有get方法
	public String fromObject;
	
	@Value("classpath:test.txt")
	public Resource testFile;
	
	@Value("http://www.baidu.com")
	public Resource testURL;
	
	@Value("${myname}")
	public String myName;
	
	@Autowired
	public Environment environment;
	
	public void readFile() throws IOException {
		System.out.println(IOUtils.toString(testFile.getInputStream()));
		System.out.println(IOUtils.toString(testURL.getInputStream()));
	}
}
