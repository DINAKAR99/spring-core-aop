
package cgg.springcore.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

        // PaymentService bean1 = container.getBean("payment", PaymentService.class);
        Circle bean2 = container.getBean("mycircle", Circle.class);
        int radius = bean2.getRadius();

        System.out.println(radius);

        // auth: payment started

        // bean1.makePayment(1000);
    }
}
