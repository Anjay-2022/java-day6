package assignment;

import java.util.Scanner;

public class Stopwatch {
	long startTime = 0;
	long stopTime = 0;
	boolean running = false;
	public void start() {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}


	public void stop() {
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}


	//elaspsed time in milliseconds
	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime);
		} else {
			elapsed = ((stopTime - startTime) / 1000);
		}
		return elapsed;
	}


	public static void main(String[] args) {
		long time;
		int a ,b;
		Stopwatch p = new Stopwatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to start time ");
		int a1 = sc.nextInt();
		p.start();
		
		//TimeUnit.SECONDS.sleep(5);
		
		System.out.println("Enter any number to stop  time ");
		int b1 = sc.nextInt();
		p.stop();
		time = p.getElapsedTime();
		System.out.println("stopwatch "+time); 
		 

	}
}
/*
System.out.println(java.time.LocalTime.now()); 
long startTime = System.nanoTime();
TimeUnit.SECONDS.sleep(5);
long endTime = System.nanoTime();

long timeElapsed = endTime - startTime; */
