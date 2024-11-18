package Thread;

public class TestExten extends Thread{
	
	@Override
	public void run() {
		System.out.println("I am run method of thread class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		TestExten t=new TestExten();
		t.start();
	}

}
