package com.cybage.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		//it will create thread pool of 5 threads
		//now 5 threads are ready for execution
		threadPool.execute(new Task());	//1
		threadPool.execute(new Task()); //2
		threadPool.execute(new Task());	//3
		threadPool.execute(new Task());	//4
		threadPool.execute(new Task());	//5
		threadPool.execute(new Task());	//6
		threadPool.execute(new Task());	//7
		
	}
}
