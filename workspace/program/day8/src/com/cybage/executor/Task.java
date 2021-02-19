package com.cybage.executor;

public class Task extends Thread{
	@Override
	public void run() {
		System.out.println("I am performing large task "+ " " + Thread.currentThread().getName()+ " and id "+Thread.currentThread().getId());
		for(int i=0 ; i<100000000;i++) {
			int sum = i + 10; 
		}
		//System.out.println(Runtime.getRuntime().availableProcessors());
		//To check number of processors.
	}
}
