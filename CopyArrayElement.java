// Java Program to copy all elements of one array into another array

// a.clone()
// System.arraycopy(Object src,int srcPos,int des,Object desPos,int length) =>length of subArray
// Arrays.copyOf(int[] original, int newLength) 
// Arrays.copyOfRange​(int[] original, int from, int to)

import java.util.*;
class CopyArrayElement{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = a.clone();
		System.out.println(Arrays.toString(b));
		int[] c = new int[a.length];
		System.arraycopy(a,0,c,0,5);
		System.out.println(Arrays.toString(c));
		int[] d = Arrays.copyOf(a,6);
		System.out.println(Arrays.toString(d));
		int[] e = Arrays.copyOfRange(a,2,8);
		System.out.println(Arrays.toString(e));
	}
}