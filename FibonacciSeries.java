package com.brizlabs;

// 0 1    1 2 3 5 8 13 21 34 
// 0, 1 1(0+1)
//a series of no in which each no is the sum of two preceding no.

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int m1=0,  m2=1, sum=0;
		System.out.println("Fibonacci Series");
		
		System.out.print( m1+ " "+m2 ); // 0 1 
		
		 for (int i=2; i<10; i++)
	    {
	    	sum =m1+m2;
	    	System.out.print(" "+sum);
	    	m1=m2;
	    	m2=sum ; 
	    }
		

	}

}
