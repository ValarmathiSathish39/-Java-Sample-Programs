// Program to Find the Largest Number Among Three Numbers


import java.util.*;
class LargestOfThree{
	public static void main(String[] args){
		int a = 89 ,b =  32,c = 22;
		Scanner sc = new Scanner(System.in);
		int largest  = c > (a > b ? a : b) ? c : ((a > b) ? a : b); 
		System.out.println(largest);
	}
}