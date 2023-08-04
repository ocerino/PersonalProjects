package edu.du.cerino.Lab17;

public class PriorityQueue<T extends Comparable<T>> extends Queue<T> {
	
	public T dequeue()
	{
		T temp = null;
		int tempPos = 0;
		if(!isEmpty())
		{
			for(int i = 0; i<queue.size()-1;i++)
			{
				if(queue.get(i).compareTo(queue.get(i+1)) <0)
				{
					temp = queue.get(i+1);
					tempPos = i+1;
				}
				else if(queue.get(i).compareTo(queue.get(i+1)) == 0)
				{
					temp = queue.get(i);
					tempPos = i;
				}
				else
				{
					temp = queue.get(i);
					tempPos = i;
				}
			}
			return queue.remove(tempPos);
		}
		else
		{
			return null;
		}
	}

}
