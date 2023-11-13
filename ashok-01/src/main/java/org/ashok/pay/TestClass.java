package org.ashok.pay;

public class TestClass {

    public static void main(String[] args) {
        Payment payment= new Payment();
        payment.setiPayment(new CraditCard());
        payment.processPayment(200.0);
        Payment payment1= new Payment(new CraditCard());
        payment1.processPayment(0.0);
        Payment payment2= new Payment(new DebitCard());
        payment2.processPayment(0.0);
    }
}
