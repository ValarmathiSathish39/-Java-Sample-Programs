import java.util.*;

public class ArrayMultiDimenRotate {
	public static void main(String[] args)
	{	
		int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int n = arr.length;
		int m = arr[0].length;
		System.out.println("No of Rows "+n); 
		System.out.println("No of Columns "+m); 
		if(m!=n){
			System.out.println("Rows and Columns should match");
		}    		
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[n-1-i][j];
				arr[n-1-i][j] = temp;
			}
		}		
		System.out.println("After Left Rotation");		
		for (int i = 0; i < n; ++i){
	        for(int j = 0; j < n; ++j) 
	        {
	            System.out.print(arr[i][j]+ " ");
	        }
	        System.out.println("");	
	    }		
	}
}