package ru.eugenev.springproject.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
    @Around("execution(* ru.eugenev.springproject.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepoMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();
        System.out.println("Begin of " + methodName);
        Object targetMethodResult = joinPoint.proceed();
        System.out.println("End of " + methodName);
        return targetMethodResult;
    }
}
