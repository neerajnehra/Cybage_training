package com.cybage.threading;

 

public class Tester extends Thread{
    @Override
    public void run() {
        try {
            sleep(1 *1000);    
        }catch(InterruptedException ie) {
            System.out.println(ie.getMessage());
        }
        System.out.println("2. i am testing code..." + getName());
    }
}