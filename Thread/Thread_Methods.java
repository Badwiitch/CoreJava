package Thread;

public class Thread_Methods extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setName("myThread");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Methods t=new Thread_Methods();
		t.start();
		System.out.println("Method alive:- "+t.isAlive());
		System.out.println("Method name:- "+t.getName());
		System.out.println("Method changedName:- "+t.getName());
		System.out.println(Thread.currentThread());
		System.out.println("Main alive:- "+Thread.currentThread().isAlive());
		System.out.println("Main Name:- "+Thread.currentThread().getName());
		Thread.currentThread().setName("myMainThread");
		System.out.println("Main changesdName:- "+Thread.currentThread().getName());
	}

}
