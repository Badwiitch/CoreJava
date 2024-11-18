package Thread;

public class PriorityMethods extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("Priority is "+Thread.currentThread().getPriority()+" of "+Thread.currentThread().getName());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Priority is "+Thread.currentThread().getPriority()+" of "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityMethods p=new PriorityMethods();
		p.start();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("Priority is "+Thread.currentThread().getPriority()+" of "+Thread.currentThread().getName());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Priority is "+Thread.currentThread().getPriority()+" of "+Thread.currentThread().getName());
	}

}
