package String;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Duplicate--------");
		duplicateInString("java is a programming language");
		System.out.println("--------Unique--------");
		UniqueInString("java is a programming language");
	}
	
	public static void duplicateInString(String s)
	{
		
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)]++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>1)
			{
				System.out.println((char)i);
			}
		}
	}
	
	public static void UniqueInString(String s)
	{
		
		int a[]=new int[256];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				a[s.charAt(i)]++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				System.out.println((char)i);
			}
		}
	}

}
