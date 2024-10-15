package String;

public class FirstWordStr {

	public static void main(String[] args) {
		System.out.println("--------Fist Word---------");
		System.out.println(capitalize("java"));
		System.out.println(capitalizeFirstcharacter("java is a programming language"));
		System.out.println();
		System.out.println("--------Fist & Last Word---------");
		System.out.println(capitalizeFirstLast("java"));
		


	}
	
	public static String capitalize(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i==0 ) {
				ans+=(char)(s.charAt(i)-32);
			}
			else
			{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	
	public static String capitalizeFirstLast(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(i==0 || i==s.length()-1) {
				ans+=(char)(s.charAt(i)-32);
			}
			else
			{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	
	public static String capitalizeFirstcharacter(String s) {
		String a[]=s.split(" ");
		String ans="";
		for(int i=0;i<a.length;i++) {
			String str=capitalize(a[i]);
			ans+=str+" ";
		}
		return ans;
	}

}
