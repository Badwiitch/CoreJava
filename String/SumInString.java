package String;

public class SumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfNumberInString("ja1315va"));
		System.out.println(sumOfNumberInString2("ja1v23a"));
	}
	
	public static int sumOfNumberInString(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				int num=Character.getNumericValue(s.charAt(i));
				sum+=num;
			}
//			int num=Charater.getNumber
		}
		return sum;
	}
	
	public static int sumOfNumberInString2(String s)
	{
		String temp="0";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				temp+=s.charAt(i);
			}
			else
			{
				sum+=Integer.parseInt(temp);
				temp="0";
			}
		}
		return sum;
	}

}
