package com.oops;

class Student
{
	int rno;
	String name;
	String address; 	
	void setValue(int rno,String name,String address
			)
	{
		this.rno=rno;
		name=name;
		address=address;
	}
	
	void getValue()
	{
		System.out.println("Roll no: "+rno);
		System.out.println("Name is: "+name);
		System.out.println("Address is: "+address);
	}
}

public class Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setValue(1, "Vaishu", "pune");
		s1.getValue();
//		s1.rno=1;           //set or assign
//		s1.name="Vaishnavi";
//		s1.address="Khar";
//		System.out.println(s1.rno);    //get or print
//		System.out.println(s1.name);
//		System.out.println(s1.address);
//		
		Student s2=new Student();
		s2.setValue(2, "Rahee", "Mahim");
		s2.getValue();
		
//		s2.rno=2;
//		s2.name="Parth";
//		s2.address="Bandra";
//		System.out.println(s2.rno);
//		System.out.println(s2.name);
//		System.out.println(s2.address);

	}

}
