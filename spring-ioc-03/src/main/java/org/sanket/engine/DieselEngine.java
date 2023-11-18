package org.sanket.engine;

public class DieselEngine implements  Engine{

    public DieselEngine() {
        System.out.println("Diesel engine : Cunstrucor");
    }

    @Override
    public boolean startEngine(int input) {
        System.out.println("Diesel engine started ");
       return input!=0 ?  true : false;

    }
}
