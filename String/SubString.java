package String;

public class SubString {
	
	//Substring is continuous part of string
	//Substring leaves last part of a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Sub String--------");
		String s="abc";
		String s1="javaa";
		System.out.println(s.substring(0, s.length()));
		System.out.println(s1.substring(0));
		System.out.println("---------Generate Possible Sub String--------");
		generateAllPosibleSubString("abc");
		System.out.println("---------Generate Possible Sub String without using inbuild method--------");
		generateAllSubString("abc");
	}
	
	public static void generateAllPosibleSubString(String s) {
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.print(s.substring(i, j+1)+" ");
			}
			System.out.println();
		}
	}
	
	//Without using inbuild method
	public static void generateAllSubString(String s) {
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}

}
