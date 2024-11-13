package Collection;

import java.util.Stack;

public class Balanced_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checlBalancedString("[()]{}"));
		System.out.println(checlBalancedString("[(])"));
		System.out.println(checlBalancedString("]()["));

	}
	
	//Check whether the string is balanced or not
	static boolean checlBalancedString(String s) {
		Stack s1=new Stack();
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{' ) {
				s1.push(s.charAt(i));
			}
			else {
				if(s1.empty()) {
					return false;
				}
				char ch=(char) s1.peek();
				if(ch=='[' && s.charAt(i)==']' || ch=='(' && s.charAt(i)==')' ||
						ch=='{' && s.charAt(i)=='}') {
					s1.pop();
				}
				else
				{
					return false;
				}
			}
		}
		if(s1.empty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
