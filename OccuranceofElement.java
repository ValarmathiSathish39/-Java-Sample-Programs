// Java Program to find the frequency of each element in the array

import java.util.*;
class OccuranceOfElement
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
			System.out.println(i.getKey()+ " " + i.getValue());
		}
	}
}

