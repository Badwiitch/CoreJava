package Polymorphism;
class Sum{
	final void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
//	var arc variable length argument
	void display(String...name) {
	System.out.println("Welcome "+name[0]);
    }
	
	void sum(int...a) {
//		System.out.println(a[0]);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	
	void printSentence(String...word) {
		String sentence="";
		for(int i=0;i<word.length;i++)
		{
			sentence+=word[i]+" ";
		}
		System.out.println(sentence);
	}
}

//Method-Overloading concept 
class Vehicle{       //depends on structure
	String movement;
	void movement(int a)      //structure means like they have diff  parameter
	{
		if(movement.equals("road"))
		{
			System.out.println("running");
		}
	}
	
	void movement(int a,int b)
	{
		if(movement.equals("water"))
		{
			System.out.println("sailing");
		}
	}
	
	void movement(int a,int b,int c)
	{
		if(movement.equals("sky"))
		{
			System.out.println("flying");
		}
	}

	
	
}

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s=new Sum();
		s.sum(2, 4);
		s.printSentence("java","is","a");
		s.display("Java");
//		s.sum(2, 4, 6);
//		Vehicle v=new Vehicle();
//		v.movement="road";
//		v.movement(4);
//		v.movement="water";
//		v.movement(4, 2);
//		v.movement="sky";
//		v.movement(2, 1, 3);
		

	}

}
