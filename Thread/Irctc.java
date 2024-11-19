package Thread;

class BookTrainSeat{
	int totalseat=20;
	public /*synchronized*/ void bookSeat(int seat) {     //By using synchronized  method
			
		//By using synchronized block
		synchronized (this) {
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
}

public class Irctc extends Thread{
static BookTrainSeat b;
	int seat;
	public void run() {
		b.bookSeat(seat);
	}
	
	public static void main(String[] args) {
		b=new BookTrainSeat();
		Irctc i1=new Irctc();
		i1.seat=10;
		i1.start();
		Irctc i2=new Irctc();
		i2.seat=15;
		i2.start();
		Irctc i3=new Irctc();
		i3.seat=5;
		i3.start();
	}
}
