package org.ashok;

public class Car {
    public static void main(String[] args) {
        Enginer enginer= new PetrolEnginer();
        System.out.println(enginer.startEnginer());
    }
}
