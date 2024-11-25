package Thread;

 class BookTrainSeat1{
	static int totalseat=20;
	static synchronized void bookSeat(int seat) {     //By using synchronized  method

			if( seat<=totalseat) {
				System.out.println(seat+" seats booked successfully!");
				totalseat=totalseat-seat;
				System.out.println("Remaining seats are: "+totalseat);
			}
			else {
				System.out.println("seat not booked");
				System.out.println("remaining seats are "+totalseat);
			}
		}
	}
 
 class MyThread1 extends Thread{
	 BookTrainSeat1 b;
	 int seat;
	 public MyThread1(BookTrainSeat1 b,int seat) {
		 this.b=b;
		 this.seat=seat;
	 }
	 
	 @Override
	 public void run(){
		 b.bookSeat(seat);
	 }
		
 }
 
 class MyThread2 extends Thread{
	 BookTrainSeat1 b;
	 int seat;
	 public MyThread2(BookTrainSeat1 b,int seat) {
		 this.b=b;
		 this.seat=seat;
	 }
	 
	 @Override
	 public void run(){
		 b.bookSeat(seat);
	 }
		
 }

 class MyThread3 extends Thread{
	 BookTrainSeat1 b;
	 int seat;
	 public MyThread3(BookTrainSeat1 b,int seat) {
		 this.b=b;
		 this.seat=seat;
	 }
	 @Override
	 public void run(){
		 b.bookSeat(seat);
	 }
		
 }

public class Irctc_Staticsynchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookTrainSeat1 b=new BookTrainSeat1();
		BookTrainSeat1 b1=new BookTrainSeat1();
		MyThread1 t1=new MyThread1(b1,10);
		MyThread2 t2=new MyThread2(b1, 5);
		MyThread3 t3=new MyThread3(b, 3);
		t1.start();
		t2.start();
		t3.start();

	}

}
