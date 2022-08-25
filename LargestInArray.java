// Java Program to print the largest element in an array


import java.util.*;
class LargestInArray{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int largest = a[0];
		// System.out.println("Largest Element" + largest);
		for(int i: a){
			if (i > largest){
				largest = i;
			}
		}
		System.out.println("Largest Element" + largest);
	}
}