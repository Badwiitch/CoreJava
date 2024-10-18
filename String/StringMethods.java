package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]= {'a','b','c'};
		byte b[]= {101,102,104,105};
		StringBuffer sb=new StringBuffer("java");
		StringBuilder sb1=new StringBuilder("java");
//		String s1=new String(c);
//		String s1=new String(b);
//		String s1=new String(sb);
		String s1=new String(sb1);
		System.out.println(s1); 
		String s=new String("java is a programming language");
		String s2=new String("Java is a programming language");
		System.out.println(s.charAt(0));
		System.out.println(s.compareTo(s2));
		System.out.println(s.length());
		System.out.println(s.concat(" object"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf("j"));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.hashCode());
		System.out.println(s.replace('a', 'v'));
		
		
		

	}

}
