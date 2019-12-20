package com.ykuee.test.aop;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import com.ykuee.test.annotation.TestAnnotation;
import com.ykuee.test.service.TestAOPAnnotationService;

@Aspect
@Component
public class TestAOP {

	@Pointcut("@annotation(com.ykuee.test.annotation.TestAnnotation)")
	public void annotationPointCut() {
		
	}
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		TestAnnotation ann = method.getDeclaredAnnotation(TestAnnotation.class);
		System.out.println("AOP拦截注解，注解name值为: "+ann.name());
		method.invoke(TestAOPAnnotationService.class.newInstance(), "TEST");
	}
	
	@Before("execution(* com.ykuee.test.service.TestAOPMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("AOP拦截方法，方法名为: "+method.getName());
		
	}
}
