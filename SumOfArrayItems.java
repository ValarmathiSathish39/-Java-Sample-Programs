// java Program to print the sum of all the items of the array

import java.util.*;
class SumOfArrayItems
{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for(int i: a){
			sum += i; 
		}
		System.out.println(sum);
	}
}

