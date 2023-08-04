package edu.du.cerino.Lab18;

public class Recursion {

	public static int sumOfSquares(int k)
	{
		int answer = k*k;
		if(k>0)
		{
			answer += sumOfSquares(k-1);
		}
		return answer;
	}
	
	public static int fib(int n)
	{
		int answer = 1;
		if(n>1)
		{
			answer = fib(n-1)+fib(n-2);
		}
		return answer;
	}
}
