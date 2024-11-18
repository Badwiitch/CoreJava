package Thread;

import ExceptionHandling.Test;

public class Test2 extends Test implements Runnable{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Test1Imple t1=new Test1Imple();
		Thread th=new Thread(t1);
		th.start();
		System.out.println("one");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am run method of Runnable interface");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Multi threading");
	}
}
