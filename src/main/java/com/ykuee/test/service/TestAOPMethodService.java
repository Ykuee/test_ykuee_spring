package com.ykuee.test.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestAOPMethodService {

	public void add() {
		
	}
	@Value("TesetTest")
	public String test="Ykuee";
	
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	
}
