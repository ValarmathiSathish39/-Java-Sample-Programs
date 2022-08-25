// Java Program to print the smallest element in an array

import java.util.*;
class SmallestInArray{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int smallest = a[0];		
		for(int i: a){
			if (i < smallest){
				smallest = i;
			}
		}
		System.out.println("smallest Element " + smallest);
	}
}