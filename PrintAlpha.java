import java.util.*;
class PrintAlpha{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter");
		char letter = sc.next().charAt(0);
		int asciiValue=(int)letter;
		if(asciiValue>=65 && asciiValue<=90){
			for(;letter<='Z';letter++){
				System.out.print(letter);
			}
		} else if(asciiValue>=97 && asciiValue<=122){
			for(;letter<='z';letter++){
				System.out.print(letter);
			}
		}else{
			System.out.println("Invalid character");
		} 		
	}
}