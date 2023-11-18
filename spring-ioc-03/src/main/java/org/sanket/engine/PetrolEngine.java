package org.sanket.engine;

public class PetrolEngine implements  Engine{
    public PetrolEngine() {
        System.out.println("Petrol Engine : cuntrocotr");
    }

    @Override
    public boolean startEngine(int input) {
        System.out.println("Petrol engine started");
        return input!=0 ?  true : false;

    }
}
