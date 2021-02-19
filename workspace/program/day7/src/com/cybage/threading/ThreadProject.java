package com.cybage.threading;

public class ThreadProject {
    //main thread will be started....
    public static void main(String[] args) throws InterruptedException {
        System.out.println("welcome to XYZ project...(manager)");
        System.out.println("information about thread...");
        System.out.println("name: "+ Thread.currentThread().getName());
        System.out.println("id: "+ Thread.currentThread().getId());
        
        Developer d = new Developer();        
        
        Tester t = new Tester();        
        
        Deployment dp = new Deployment();
        
        d.setName("developer");
        t.setName("tester");
        dp.setName("deployment");
        
//        d.setPriority(1);
//        t.setPriority(2);
//        dp.setPriority(3);
        
        //d.setDaemon(true);        //d will be background thread(daemon)
        
        dp.start();
        d.start();            //it will give a call to run method
        t.start();
//        System.out.println(d.getPriority());
//        System.out.println(t.getPriority());
//        System.out.println(dp.getPriority());
        
        
        //we need to wait till the execution of all the threads...
        d.join(2);
        t.join();
        dp.join();
        
        System.out.println("4. we have finish project...");    
    }
}