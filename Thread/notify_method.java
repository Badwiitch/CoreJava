package Thread;

class Totalncome extends Thread{
	int totalearning=0;
	public void run() {
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				totalearning=1000;
			}
			this.notify();
		}
	}
}

public class notify_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Totalncome t1=new Totalncome();
		t1.start();
		synchronized (t1) {
			t1.wait();
			System.out.println("Income: "+t1.totalearning);
			
		}

	}

}
