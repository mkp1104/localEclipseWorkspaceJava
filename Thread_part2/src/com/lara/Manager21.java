package com.lara;
class B2 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);

		}


	}
}
public 	class Manager21 {
		public static void main(String[] args) {
			B2 b1 = new B2();
			Thread t1 = new Thread(b1);
			t1.start();
			for (int i = 10; i < 20; i++) {
				System.out.println(i);

			}
			System.out.println("done");
		}
	}
