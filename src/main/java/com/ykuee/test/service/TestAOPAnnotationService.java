package com.ykuee.test.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.ykuee.test.annotation.TestAnnotation;

@Service
@Scope(value="prototype")
public class TestAOPAnnotationService {

	@TestAnnotation(name="AnnTestService")
	public void add(String s) {
		System.out.println("invoke:"+s);
	}
}
