package String;

public class LongestLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestLengthInSubString("ababa");
	}
	
	public static void longestLengthInSubString(String s) {
		int maxilength=Integer.MIN_VALUE;
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str =s.substring(i, j+1);
				if(CheckPalindrom(str)) {
			//		maxilength=Math.max(maxilength, str.length());
					if(str.length()>=maxilength) {
						ans=str;
						maxilength=str.length();
					}
				}
			}	
		}
		System.out.println(ans);
		System.out.println(maxilength);
	}
	
	public static boolean CheckPalindrom(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
		{
			return true;
		}
		return false;
	
	}

}
