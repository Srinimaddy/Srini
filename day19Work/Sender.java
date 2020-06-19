package day19Work;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
	private Data data;
	public Sender(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		String message[] = {"Message 1","Second MEssage","3rd Message","4444","Over"};
		for(String msg : message) {
			data.send(msg);
			try {
				Thread.sleep(500);
				}
			catch(InterruptedException e) {
				Thread.currentThread();
				System.out.println("Thread Interrruped");
			}
		}
		
		
	}
	

}
