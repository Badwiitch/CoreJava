package Collection;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.add(1);
		s.push(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println("Return top most element: "+s.peek());
		System.out.println(s);
		System.out.println("Remove top most element: "+s.pop());
		//If not found then return neg value
		System.out.println("Return position of element: "+s.search(6));   
		System.out.println(s.search(2));
		System.out.println(s);
	}

}
