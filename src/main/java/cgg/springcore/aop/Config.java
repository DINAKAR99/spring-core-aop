package cgg.springcore.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration

@EnableAspectJAutoProxy
public class Config {
    @Bean(name = { "payment" })
    public PaymentService getPayment() {
        return new PaymentServiceImpl();
    }

    @Bean(name = { "mycircle" })
    public Circle getCircle() {
        return new Circle();
    }

    @Bean(name = { "myaspect" })
    public Aspect1 getAspect1() {
        return new Aspect1();
    }

}
