package cgg.springcore.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class Aspect1 {

    // @Before("execution(* cgg.springcore.aop.PaymentServiceImpl.makePayment(..))")
    @Before("advice4()")
    public void printBefore() {
        System.out.println("PAYMENT STARTED");
    }

    // @Before("execution(public int get*())")
    // public void advice2() {
    // System.out.println("this is advice 2");
    // }

    @After("execution(public int get*())")
    public void advice3() {
        System.out.println("this is advice 3");
    }

    @Pointcut("execution(public int get*())")
    public void advice4() {
        System.out.println("this is advice 4 next will be payment started");
        System.out.println("this is advice 4 next will be payment started");
    }

    @After("execution(* cgg.springcore.aop.PaymentServiceImpl.makePayment(..))")
    public void printAfter() {
        System.out.println("PAYMENT COMPLETED");
    }

}
