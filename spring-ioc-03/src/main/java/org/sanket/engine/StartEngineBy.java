package org.sanket.engine;

public class StartEngineBy {

    Engine engine;
    public StartEngineBy(Engine engine){
        this.engine=engine;

        System.out.println("Created object for "+engine.getClass().getName() +" with hashcode "+this.engine.hashCode());

    }

    public void setEngine(Engine engine) {
        System.out.println("Called setteer Method ");
        this.engine = engine;
    }

    public StartEngineBy() {
    }

    public void statTheEngine(int input){
        System.out.println("Starting Engine of type  "+ engine.getClass().getName());
        System.out.println("Hash code is "+engine.hashCode());
        engine.startEngine(input);

    }
}
