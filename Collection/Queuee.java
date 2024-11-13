package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MinHeap i.e arranging in ascending order
		Queue q=new PriorityQueue();
		System.out.println("Implemented based of MinHeap");
		q.add(1);
		q.add(2);
		q.offer(6);
		q.offer(3);
		q.add(10);
		q.add(8);
		q.add(4);
		q.add(5);
		q.add(9);
		q.add(7);
		System.out.println("Peek: "+q.peek());
		System.out.println(q);
		System.out.println("Poll: "+q.poll());
		System.out.println(q);
		System.out.println();
		
		//MaxHeap i.e arranging in descnding order
		Queue q1=new PriorityQueue(Collections.reverseOrder());
		System.out.println("Implemented based of MaxHeap");
		q1.add(1);
		q1.add(2);
		q1.offer(6);
		q1.offer(3);
		q1.add(10);
		q1.add(8);
		q1.add(4);
		q1.add(5);
		q1.add(9);
		q1.add(7);
		System.out.println("Peek: "+q1.peek());
		System.out.println(q1);
		System.out.println("Poll: "+q1.poll());
		System.out.println(q1);

	}

}
