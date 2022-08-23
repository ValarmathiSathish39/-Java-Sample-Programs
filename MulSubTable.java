// import java.util.System;
import java.util.*;
class MulSubTable{
	public static void main(String[] args){
		int num,limit,noOfRow;
		// long mulRes,subRes;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		//System.out.println("Enter the limit");
		//limit = sc.nextInt();
		System.out.println("Enter the Number of row");
		noOfRow = sc.nextInt();
		System.out.println("Multiplication table");
		for(int i=1;i<=noOfRow;i++){
			System.out.println(i + "*" + num + "=" + i*num);
		}
		System.out.println("Subraction table");
		for(int i=num;i<=noOfRow+num;i++){
			System.out.println(i + "-" + num + "=" + (i-num));
		}
	}
	
} 