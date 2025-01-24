package Matrix;

import java.util.Scanner;

public class Addition {
	
	
	
	public static void addition(int a[][],int b[][]) {
		int r1=a.length;
		int r2=b.length;
		int c1=a[0].length;
		int c2=b[0].length;
		
		if(r1!=r2 || c1!=c2){
			System.out.println("Addition mismatch");
		}
		
		int ans[][]=new int[r1][c1];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				ans[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//print ans array
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int a[][]= {{1,2} ,{3,4}};
		int b[][]= {{1,2} ,{3,4}};
		addition(a, b);
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		int jrr[][]=new int[2][2];
		int add[][]=new int[2][2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				jrr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				add[i][j]=arr[i][j]+jrr[i][j];
			}
		}
		System.out.println("Addition: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}

	}

}
