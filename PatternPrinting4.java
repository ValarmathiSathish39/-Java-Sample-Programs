import java.util.*;
class PatternPrinting4
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i,j,k,count=n;		
		for(i=1;i<=n;i++){
			for(j=2;j<=i;j++){
				System.out.print(" ");
			}	
			for(k=n-i;k>=0;k--){
				System.out.print(count+" ");
			}	
			System.out.println();
			count--;
		}
	}
}

