package String;

public class DistanceInChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		editDistance("abegc");
	}
	
	public static void editDistance(String s)
	{
		String ans="";
		ans+=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			int distance=s.charAt(i)-s.charAt(i-1);
			ans+=distance;
			ans+=s.charAt(i);
		}
		System.out.println(ans);
	}

}
