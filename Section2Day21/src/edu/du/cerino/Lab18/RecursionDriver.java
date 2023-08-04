package edu.du.cerino.Lab18;

public class RecursionDriver {

	public static void main(String[] args) {
		for(int i=0;i<11;i++)
		{
			System.out.println("sumOfSquares("+i+") = " + Recursion.sumOfSquares(i));
		}
		
		for(int i=0;i<11;i++)
		{
			System.out.println("fib("+i+") = " + Recursion.fib(i));
		}
	}

}
