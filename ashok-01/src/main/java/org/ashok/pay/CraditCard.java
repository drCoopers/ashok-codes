package org.ashok.pay;

public class CraditCard implements  IPayment {

    public CraditCard(){
        System.out.println("Cradit card ");
    }

    @Override
    public Boolean pay(Double ammount) {
        System.out.println("Processing card card ");

        return ammount > 0.0;
    }
}
