import java.util.*;
class ArrayAscenDesc
{
	public static void main(String[] args){
		int[] a = {2,9,4,65,22,77,22,44,5};
		int length = a.length;
		int temp;
		for(int i=0;i<length;i++){
			if(i%2==0){
				for(int j=i;j<length;j=j+2){
					for(int k=i;k<length;k=k+2){
						if(a[j]>a[k]){
							temp = a[j];
							a[j] = a[k];
							a[k] = temp;
						}
					}
				}
			} else {
				for(int j=i;j<length;j=j+2){
					for(int k=i;k<length;k=k+2){
						if(a[j]<a[k]){
							temp = a[j];
							a[j] = a[k];
							a[k] = temp;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));		
	}
}