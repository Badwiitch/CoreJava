package Thread;

public class InterruptedMethod extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptedMethod i=new InterruptedMethod();
		i.start();
		i.interrupt();
	}

}
