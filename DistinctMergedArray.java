import java.util.*;
import java.util.stream.IntStream;

class DistinctMergedArray{
	public static void main(String[] args){
		DistinctMergedArray distinctMergedArray = new DistinctMergedArray();
		int[] a={2,4,5,6,7,9,10,13};
		int[] b={2,3,4,5,6,7,8,9,11,15};
		distinctMergedArray.usingIntStream(a,b);
		distinctMergedArray.usingCollection(a,b);		
	}
	public void usingIntStream(int[] a,int[] b){
		int[] result= IntStream.concat(IntStream.of(a), IntStream.of(b))
                        .distinct()
                        .sorted()
                        .toArray();
		System.out.println("Sorted Array:"+Arrays.toString(result));
	}
	public void usingCollection(int[] a,int[] b){
		Set result = new HashSet<>();
		int k = 0;
		int[] mergedArray = new int[a.length + b.length]; 
		for(int i=0;i<a.length;i++){
			mergedArray[k] = a[i];
			k++;
		}
		for(int i=0;i<b.length;i++){
			mergedArray[k] = b[i];
			k++;
		}
		for(int i=0;i< mergedArray.length;i++){
			result.add(mergedArray[i]);
		}
		System.out.println("Sorted Array:"+result);
		
	}	
}

