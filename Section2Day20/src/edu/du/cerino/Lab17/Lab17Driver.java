package edu.du.cerino.Lab17;

public class Lab17Driver {

	public static void main(String[] args) {
		//test Integer queue
		Queue<Integer> intQueue = new Queue<Integer>();
		intQueue.enqueue(1);
		intQueue.enqueue(2);
		intQueue.enqueue(3);
		System.out.println(intQueue.dequeue());
		System.out.println(intQueue.dequeue());
		System.out.println(intQueue.dequeue());
		System.out.println(intQueue.isEmpty());
		
		//test String queue
		Queue<String> stringQueue = new Queue<String>();
		stringQueue.enqueue("First");
		stringQueue.enqueue("Second");
		stringQueue.enqueue("Thrid");
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.dequeue());
		System.out.println(stringQueue.isEmpty());
		
		//test Integer stack
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.isEmpty());
		
		//test String stack
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("First");
		stringStack.push("Second");
		stringStack.push("Third");
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.pop());
		System.out.println(stringStack.isEmpty());
		
		//test Integer priority queue
		PriorityQueue<Integer> intPQ = new PriorityQueue <Integer>();
		intPQ.enqueue(15);
		intPQ.enqueue(100);
		intPQ.enqueue(50);
		System.out.println(intPQ.dequeue());
		System.out.println(intPQ.dequeue());
		System.out.println(intPQ.dequeue());
		System.out.println(intPQ.isEmpty());
		
		//test String priority queue
		PriorityQueue<String> stringPQ = new PriorityQueue <String>();
		stringPQ.enqueue("First");
		stringPQ.enqueue("Second");
		stringPQ.enqueue("Third");
		stringPQ.enqueue("Fourth");
		System.out.println(stringPQ.dequeue());
		System.out.println(stringPQ.dequeue());
		System.out.println(stringPQ.dequeue());
		System.out.println(stringPQ.dequeue());
		System.out.println(stringPQ.isEmpty());
	}

}
