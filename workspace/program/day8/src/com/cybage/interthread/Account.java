package com.cybage.interthread;

public class Account {
    private int balance = 25000;
    
    public synchronized void withdraw(int amount) {
        
        System.out.println("Performing withdrawl operation");
        
        //logic for withdrawl
        if(this.balance <= amount) {
            //need to keep withdraw in waiting state till deposit happens
            System.out.println("Your account balance is low.");
        	try {
                wait();                //waiting for other method to finish
            } catch (InterruptedException e) {
                System.err.println(e.getLocalizedMessage());
            }
        }
        this.balance -= amount;
        
        System.out.println("Withdrawl operation finished");
    }
    
    public synchronized void deposit(int amount) {
        System.out.println("Performing deposit operation");
        
        //logic for deposit        
        this.balance += amount;
        notify();    //i have finished.. so waiting thread can resume execution
        
        System.out.println("deposit operation finished");
    }

 

}