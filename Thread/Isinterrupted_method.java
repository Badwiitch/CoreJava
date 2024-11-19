package Thread;

public class Isinterrupted_method extends Thread{
	
	public void run() {
//		System.out.println(Thread.currentThread().isInterrupted());
//		System.out.println(Thread.interrupted());
//		System.out.println(Thread.interrupted());
//		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().isInterrupted());
	//	System.out.println(Thread.interrupted());
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Isinterrupted_method i=new Isinterrupted_method();
		i.start();
		i.interrupt();
	}

}
