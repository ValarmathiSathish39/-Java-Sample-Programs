import java.util.*;
class PatternPrinting3
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i,j,k;		
		for(i=1;i<=n;i++){
			for(j=2;j<=i;j++){
				System.out.print(" ");
			}	
			for(k=n-i;k>=0;k--){
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}

