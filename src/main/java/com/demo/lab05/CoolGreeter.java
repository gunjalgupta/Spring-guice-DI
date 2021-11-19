package com.demo.lab05;

public class CoolGreeter implements Greeter{
    private String message;
    public CoolGreeter(String msg)
    {
        this.message= msg;
    }
    @Override
    public void greet(){
        System.out.println("Hey world. Me"+ message);
    }
}
