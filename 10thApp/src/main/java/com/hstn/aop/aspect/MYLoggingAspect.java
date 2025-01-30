package com.hstn.aop.aspect;

import com.hstn.aop.Admin;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
@Order(10)
public class MYLoggingAspect {

    @After("execution(* find*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.out.println("    After = " + method);
    }

    @AfterThrowing(pointcut = "execution(* find*(..))",
            throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) {
        String method = joinPoint.getSignature().getName();
        System.out.println("    AfterThrowing = " + method);
        System.out.println("    AfterThrowing exception = " + exception.getMessage());
    }

    @AfterReturning(pointcut = "execution(* find*(..))",
            returning = "result")
    public void afterReturning(JoinPoint joinPoint, List<Admin> result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("    methodName = " + methodName);
        System.out.println("    result" + result);

        changeResult(result);
    }

    private void changeResult(List<Admin> result) {
        for (Admin admin : result) {
            admin.setName(admin.getName().toUpperCase());
            if (admin.getName().equals("BORIS")) {
                admin.setName("HACKER");
            }
        }
    }

    @Before("MyPointcutExpression.pointcutForMethods()")
    public void beforeAddUserData(JoinPoint joinPoint) {
        System.out.println("    1 Before");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("        Method: " + methodSignature);

        Object[] args = joinPoint.getArgs();
        //System.out.println("        agrs: " + Arrays.toString(args));
        for (Object arg : args) {
            System.out.println("        agr: " + arg.toString());
        }
    }

}
