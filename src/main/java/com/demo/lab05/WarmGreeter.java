package com.demo.lab05;

public class WarmGreeter implements Greeter{
    private String message;
    public WarmGreeter(String msg){
        this.message=msg;
    }

    @Override
    public void greet(){
        System.out.println("Hello, my dear world. I am "+message+". Nice to see you!");
    }
}
