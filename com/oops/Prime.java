package com.oops;

import java.util.Scanner;

class Prrime
{
	static boolean checkPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	static void printPrimeno(int start,int end) 
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(checkPrime(i)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total prime no: "+count);
	}
}



public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no: ");
//		int num=sc.nextInt();
		Prrime p=new Prrime();
		p.printPrimeno(1, 100);
	

	}

}
