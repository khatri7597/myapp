package com.myapp.myapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class User{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class MyCallable implements Callable<User> {
	
	

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Future<User>> futures = new ArrayList<Future<User>>();
		Callable<User> callable = new MyCallable();
		for(int i = 0;i < 100; i++) {
			Future<User> future = executorService.submit(callable);
			futures.add(future);
		}
		for(Future<User>  future : futures) {
			try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+future.get().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
		}
		System.out.println("finished");
	}
	@Override
	public User call() throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		user.setName(Thread.currentThread().getName());
		return user;
	}

}
