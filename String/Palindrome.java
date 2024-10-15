package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CheckPalindrom("abba"));
	}
	public static String CheckPalindrom(String a)
	{
		String rev=reverseWord(a);
		if(rev.equals(a))
		{
			return "Palindrom";
		}
		return "Not Palindrom";
	
	}
	public static String reverseWord(String s)
	{
		
		String ans="";
		String temp=s;
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}

}
