package com.tcs;

public class Fibonacci {

public static void main(String[] args) {
		
//		int n=10;
//		int first=0;
//		int second=1;
//		int next;
//		
//		for(int i=1;i<=n;i++)
//		{
//			System.out.print(first+" ");
//				
//		next= first+second;
//		first=second;
//		second=next;
//	}
	//palindrome program
	//Initialize array  
    int [] arr = new int [] {25, 11, 7, 75, 77};  
    //Initialize max with first element of array.  
    int max = arr[0];  
    System.out.println(arr[0]);
    //Loop through the array  
    for (int i = 0; i < arr.length; i++) {  
        //Compare elements of array with max  
       if(arr[i] > max)  
           max = arr[i]; 
       
    }  
    System.out.println("Largest element present in given array: " + max);  

	}
}
