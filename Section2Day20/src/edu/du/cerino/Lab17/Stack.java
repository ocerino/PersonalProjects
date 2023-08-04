package edu.du.cerino.Lab17;

import java.util.ArrayList;

public class Stack<T> {
private ArrayList<T> stack;
	
	public Stack()
	{
		stack = new ArrayList<T>();
	}
	
	public void push(T t) 
	{
		stack.add(t);
	}
	
	public T pop()
	{
		if(!isEmpty())
		{
			return stack.remove(stack.size()-1);
		}
		else
		{
			return null;
		}
	}
	
	public boolean isEmpty()
	{
		return stack.size() == 0;
	}

}
