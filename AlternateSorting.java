import java.util.*;
class AlternateSorting{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5, 6, 7 , 8};
        int n = arr.length;
		Arrays.sort(arr); 
        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        if (n % 2 != 0)
            System.out.print(arr[i]);
	}
}



		