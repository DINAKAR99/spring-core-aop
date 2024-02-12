package cgg.springcore.aop;

import org.springframework.stereotype.Component;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment(int amount) {
        /// PAYMENT CODE
        System.out.println(amount + "AMOUNT DEBITED");

        //////

        System.out.println(amount + "AMOUNT CREDITED");
    }

}
