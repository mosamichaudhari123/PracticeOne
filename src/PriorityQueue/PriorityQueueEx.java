package PriorityQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue queue = new PriorityQueue();
		queue.add(123);
		queue.add(456);
		queue.add(10);
		queue.add(213);
		queue.add(40);
		System.out.println("Size:"+queue.size());
		System.out.println("Element of Queue:"+queue);
		System.out.println("head element of the queue using element():"+queue.element());
		System.out.println("head element of the queue using peek():"+queue.peek());
		System.out.println("Iterating the queue elements using for-each loop:");
		for(Object obj:queue) {
			System.out.println(obj);
		}
		System.out.println("Iterating the queue elements using iterator:");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Eleements of Queue: " + queue);
		System.out.println("removing element from Queue using remove(): " + queue.remove());
		System.out.println("Eleements of Queue: " + queue);
		System.out.println("removing element from Queue using poll(): " + queue.poll());// 50
		System.out.println("Eleements of Queue: " + queue);
		System.out.println("after removing two elements:");
		Iterator itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("*********************");
		// using lamda expression
		queue.forEach(obj -> {
			System.out.println(obj);
		});


	}

}
