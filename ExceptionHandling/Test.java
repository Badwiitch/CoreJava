package ExceptionHandling;

public class Test {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(12/0);
		}
		catch(Exception e) {
			System.out.println("Cannot divide zero");
		}
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		
		//Index Out Of Bound Exception
//		int a[]= {1,2,3,4,5,6};
//		for(int i=0;i<=a.length;i++) {
//			System.out.println(a[i]);
//		}
		
		//NullPointerException
		//Because of if-else block it will run catch block
		System.out.println("----------Using If-else block---------");
		String s=null;
		try {
			if(s!=null) {
				System.out.println(s.length());
			}
			else
			{
				System.out.println("hello");
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		
		//2 method
		System.out.println("----------Using Try catch block---------");
		String s1s=null;
		try {
			System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println("hello");
		
		divide();
	//	multily();

	}
	
	
	static void divide() {
		try {
			System.out.println("----------Using Finally block---------");
			System.out.println(12/4);
			//return;     //it terminates the program after this line
			System.exit(0);    //
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			//e.printStackTrace();
			System.out.println(e.getMessage());
			//System.out.println(e);
			//System.out.println(e.toString());
		}
		//It is a block that is always excuted even when exception occured or not.
		//It is use for writing the clean up code like closing the file closing the connection.
		//If you forcefully want to stop the finally block use System.exit(0).
		//System.exit(0) this line to be return in that block of code which will run.
		
		finally {
			System.out.println();
			System.out.println("finally block");
		}
	}
	
//	static void multily() {
//		System.out.println(2*4);
//	}

}
