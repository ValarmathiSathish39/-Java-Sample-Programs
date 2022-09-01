import java.util.*;
class PatternPrinting2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i,j,k;
		int count = n;
		for(i=1;i<n+1;i++){
			for(j=1;j<n-i+1;j++){
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++){
				if(k>i)					
					count--;	
				System.out.print(count);
				if(k<i)
					count++;
			}
			count--;
			System.out.println();
		}
	}
}

