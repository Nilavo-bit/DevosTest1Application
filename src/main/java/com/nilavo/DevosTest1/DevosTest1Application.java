package com.nilavo.DevosTest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

@SpringBootApplication
public class DevosTest1Application {

	public static void main(String[] args) {

		SpringApplication.run(DevosTest1Application.class, args);

		ExecutorService service = Executors.newFixedThreadPool(3);
		ThreadWithCallable task1 = new ThreadWithCallable(10);
		ThreadWithCallable task2 = new ThreadWithCallable(20);
		ThreadWithCallable task3 = new ThreadWithCallable(30);

		Future<Integer> getTask1 =service.submit(task1);
		Future<Integer> getTask2 =service.submit(task2);
		Future<Integer> getTask3 = service.submit(task3);

		try {
			// Retrieve results
			System.out.println(getTask1.get());
			System.out.println(getTask2.get());
			System.out.println(getTask3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}







	}

}
class ThreadWithCallable implements Callable<Integer>{

	private int value;
	public ThreadWithCallable(int value)
	{
		this.value=value;
	}

	@Override
	public Integer call() throws Exception {
		Thread.sleep(3000);
		return value*3;
	}
}





