// Program to Demonstrate the Working of Keyword long

import java.util.*;
class LongDataTypeExample{
	public static void main(String[] args){
		long num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		num = (long)a;
		System.out.println(num);
		num  = 8L;
		System.out.println(num);
	}
}