package com.testyantra.Bankexception;

public class Exercise extends Thread {
	int max;

	public Exercise(int max) {
		this.max = max;
	}

	@Override
	public void run() {
		while (max > 0) {
			if (max % 2 == 0) {
				System.out.println(max);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}

			}
			max--;
		}
	}

	public static void main(String[] args) {
		Exercise exercise = new Exercise(10);
		exercise.start();
		Exercise exercise2 = new Exercise(20);
		exercise2.start();
	}

}
