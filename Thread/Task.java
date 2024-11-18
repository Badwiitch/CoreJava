package Thread;

//Performing single task from single thread
//Performing single task from multiple thread
//Performing multilple task from single thread we cannot achieve
//Performing multiple task from multiple thread

class Task1 extends Thread{
	public void run() {
		System.out.println("I am Task1");
	}
}

class Task2 extends Thread{
	public void run() {
		System.out.println("I am Task2");
	}
}

class Task3 extends Thread{
	public void run() {
		System.out.println("I am Task3");
	}
}
public class Task extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Task t=new Task();
		t.start();
		Task th=new Task();
		th.start();
		Task1 t1=new Task1();
		t1.start();
		Task2 t2=new Task2();
		t2.start();
		Task3 t3=new Task3();
		t3.start();
		
	}
	@Override
	public void run() {
		System.out.println("I am run method of thread class");
	}
	

}
