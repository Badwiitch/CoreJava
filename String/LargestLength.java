package String;

public class LargestLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(largestLengthOfString("java is a programming language"));

	}
	
	public static String largestLengthOfString(String s) {
		String a[]=s.split(" ");
		String ans="";
		int maxilength=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>maxilength)
			{
				maxilength=a[i].length();
				ans=a[i];
			}
			
		}
		return ans;
	}

}
