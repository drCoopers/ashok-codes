package org.ashok.pay;

public class Payment {

    public IPayment iPayment;
    Payment(IPayment iPayment){
        this.iPayment=iPayment;
    }
    Payment(){

    }


    public void setiPayment(IPayment iPayment) {
        this.iPayment = iPayment;
    }

    public  void processPayment(Double ammount){
       Boolean status= iPayment.pay(ammount);
       if (status){
           System.out.println("payment completed Thank you .....");
       }else {
           System.out.println("ERROR ...........");
       }
    }
}
