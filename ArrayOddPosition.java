// Java Program to print the elements of an array present on odd position

import java.util.*;
class ArrayOddPosition{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i+=2){
			System.out.print(a[i] + " ");
		}
	}
}