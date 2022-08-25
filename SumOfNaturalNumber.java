// Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum.


import java.util.*;
public class SumOfNaturalNumber{    
	public static void main(String args[])   
	{   
		int n;  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a how many natural number want you to sum");
		n = sc.nextInt();
		int result = n * (n + 1) / 2;	
		System.out.println("Sum of Natural Numbers is: " + result);
		int largest = 0; 
		int digit;
		for (;result>0;result/=10){
			digit = result %10;
			if(digit  > largest){
				largest = digit;
			}			
		}
		System.out.println("Largest digit = "+largest);	
	}   
}   