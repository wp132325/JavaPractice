package org.dimigo.thread;

import java.util.Random;

public class Runner extends Thread {
	
	private String name;
	
	public Runner() {
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i = 100;i >= 0;i-=10) {
			int time = new Random().nextInt(1000);
			
			System.out.println(name + " " + i + "미터");
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		System.out.println(name + " 도착");
		
	}
	
}