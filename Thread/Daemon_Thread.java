package Thread;

public class Daemon_Thread extends Thread{
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daemon_Thread d=new Daemon_Thread();
		d.setDaemon(true);
		d.start();
		System.out.println(d.isDaemon());
		System.out.println(Thread.currentThread().isDaemon());
		

	}

}
