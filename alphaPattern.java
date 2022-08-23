import java.util.*;
class alphaPattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the chararcter");
		char c = sc.next().charAt(0);
		if (c >= 'A' && c <= 'Z'){
			int i = (int)c;            	
			for (;i>=65;i--){
				for(int j=i;j>=65;j--){
					System.out.print((char)i);
				}
				System.out.println();
			}			
		} else if (c >= 'a' && c<= 'z'){
			int i = (int)c;
			for(;i>=97;i--){
				for(int j=i;j>=97;j--){
					System.out.print((char)i);
				}
				System.out.println();				
			}			
		} else {
			System.out.println("Invalid letter");
		}
	}
}	