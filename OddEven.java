// Program to Check Whether a Number is Even or Odd

import java.util.*;
class OddEven{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		if(num%2 == 0){
			System.out.println("Even num");
		} else {
			System.out.println("Odd num");
		}	
	}
}