import java.util.*;
class PatternPrinting1
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i,j,k;
		int count = 1;
		for(i=1;i<=n;i++){
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
			
			System.out.println();
		}
	}
}

