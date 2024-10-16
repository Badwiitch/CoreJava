package String;

public class PalindromSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------Generate Possible"
				+ " Palindrom in a Sub String--------");
		generateAllPosibleSubString("ababa");
	}
	
	public static void generateAllPosibleSubString(String s) {
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String str =s.substring(i, j+1);
				if(CheckPalindrom(str)) {
					System.out.println(str);
				}
			}	
		}
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
