// Program to Find Factorial of a Number and the factorial number's sum of digits

import java.util.*;
class FactorialSum{
	public static void main(String[] args){
		FactorialSum factorialSum= new FactorialSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();		
		sumFactDigit(factorialSum.factorial(num));
	}
	public int factorial(int num){
		int fact = 1;
		while(num >= 1){
			fact *= num;
			--num;
		}
		System.out.println(fact);
		return fact;		
	}
	public static void sumFactDigit(int num){
		int digit,sum = 0;		
		for(;num>0;num/=10){
			digit = num % 10;			
			sum += digit;		
		}
		System.out.println("Sum of Factorial = "+sum);
	}
}