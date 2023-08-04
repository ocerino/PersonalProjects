package edu.du.cerino.Lab17;

import java.util.*;

public class Queue<T> {
	protected ArrayList<T> queue;
	
	public Queue()
	{
		queue = new ArrayList<T>();
	}
	
	public void enqueue(T t) 
	{
		queue.add(t);
	}
	
	public T dequeue()
	{
		if(!isEmpty())
		{
			return queue.remove(0);
		}
		else
		{
			return null;
		}
	}
	
	public boolean isEmpty()
	{
		return queue.size() == 0;
	}

}
