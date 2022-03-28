package com.testyantra.assignment;


	public class CompileTimeReceipient {

		public void thread() throws InterruptedException {
			Thread.sleep(1000);
			Thread.currentThread().interrupt();
			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
		}

	}



