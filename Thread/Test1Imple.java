package Thread;

import ExceptionHandling.Test;

public class Test1Imple  implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Test1Imple t1=new Test1Imple();
		Thread th=new Thread(t1);
		th.start();
		
	}
 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am run method of Runnable interface");
	}

}
