import java.util.*;
class NumberPattern2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		int length = s.length();
		System.out.println(length);
		for(int i=0;i< length;i++){
			
			for(int j=0;j< length;j++){
				if(i == j){
					System.out.print(s.charAt(i));
				} else if(i+j == length-1){
					System.out.print(s.charAt((length-1)-i));
				} else
					System.out.print(" ");	
			}
			System.out.println();
		}
	}
}