package com.cybage.threading;

 

public class Developer extends Thread{
    @Override
    public void run() {
        try {
            sleep(5 *1000);    
        }catch(InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("1. i am developing code..." + getName());
    }
}