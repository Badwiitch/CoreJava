package com.oops;

class Armss
{	static int countOfDigit(int num) {
	int count=0;
	while(num>0) {
		count++;
		num=num/10;
	}
	return count;
}
	static boolean checkArm(int n)
	{
		int p=countOfDigit(n);
		int temp=n;
		int arm=0;
		while(n>0) {
			int rem=n%10;
			arm=(int) (arm+Math.pow(rem,p));
			n/=10;
			
		}
		if(arm==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	static void printArmsno(int start,int end) 
	{
		for(int i=start;i<=end;i++)
		{
			if(checkArm(i)) {
				System.out.println(i);
				
			}
		}
		
}
}

public class ArmS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armss a=new Armss();
		a.printArmsno(1, 500);
//		System.out.println(a.countOfDigit(123456));
//		System.out.println(a.checkArm(17));
//		System.out.println("hello");

	}

}
