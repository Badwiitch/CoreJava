package com.oops;

import java.util.Scanner;

class Arm
{
	static boolean checkArm(int n)
	{
		int sum=0,digit,temp=n;
		while(n<1)
		{
			digit=n%10;
			sum=sum+digit*digit*digit;
			n=n/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
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




public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no: ");
//		int num=sc.nextInt();
		Arm a=new Arm();
		a.printArmsno(1, 100);
	}

}
}
