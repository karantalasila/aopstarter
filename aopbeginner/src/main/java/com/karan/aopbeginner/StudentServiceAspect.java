package com.karan.aopbeginner;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentServiceAspect {
	@Around(value="execution(* com.karan.aopbeginner.StudentService.*(..)) and args(name,studentId)")
	public void beforeAdvice(JoinPoint joinPoint,String name,String studentId) {
		
		System.out.println("Before method:"+joinPoint.getSignature());
		
		System.out.println("Before adding new student");
	}
	
	@Around(value="execution(* com.karan.aopbeginner.StudentService.*(..)) and args(name,studentId)")
	public void afterAdvice(JoinPoint joinPoint,String name,String studentId) {
		
		System.out.println("After method:"+joinPoint.getSignature());
		
		System.out.println("After adding student with name-"+name+"and id-"+studentId);
	}

}
