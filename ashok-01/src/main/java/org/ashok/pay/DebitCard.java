package org.ashok.pay;

public class DebitCard implements  IPayment{

    @Override
    public Boolean pay(Double ammount) {
        System.out.println("Processing dabit card ");
        return true;
    }
}
