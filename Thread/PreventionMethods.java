package Thread;

public class PreventionMethods extends Thread{
	//sleep method
	/*public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
	
	//Yield Method
	/*public void run() {
		Thread.yield();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}*/
	
	//Join method
	static Thread m;
	public void run() {
		try {
			m.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m=Thread.currentThread();
		PreventionMethods p=new PreventionMethods();
		p.start(); 
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
