package org.ashok;

public class Car {
    private  Enginer enginer;
   public void  drive(){
       System.out.println(enginer.startEnginer());

   }

   public  Car (Enginer enginer){
       this.enginer=enginer;
   }
    public static void main(String[] args) {
        Car car= new Car(new PetrolEnginer());
        car.drive();
    }
}
