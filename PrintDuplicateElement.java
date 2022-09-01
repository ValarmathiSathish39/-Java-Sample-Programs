// Java Program to print the duplicate elements of an array

import java.util.*;
class PrintDuplicateElement
{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9,8,6,4,2,1,2,4,5,6,7,7};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i: a){
			if (map.containsKey(i)){
				map.put(i,map.get(i)+1);
			} else{
				map.put(i,1);
			}
		}
		for(Map.Entry i:map.entrySet()){
			if((int)i.getValue() > 1){
				System.out.println(i.getKey());
			}
		}
	}
}

