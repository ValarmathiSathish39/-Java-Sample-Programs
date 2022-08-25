// Program to Check Whether a Character is a Vowel or Consonant

// A,E,I,O,U
// aeiou
import java.util.*;
class VowelConst{
	public static void main(String[] args){
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		c = sc.next().charAt(0);
		if(c>='A' && c<='Z'){
			if (c =='A'|| c=='E' || c== 'I' || c=='O' || c=='U')
				System.out.println("Character is a Vowel");
			else 
				System.out.println("Character is a Consonant");
		} else if(c>='a' && c<='z') {
			if (c =='a'|| c=='e' || c== 'i' || c=='o' || c=='u')
				System.out.println("Character is a Vowel");
			else 
				System.out.println("Character is a Consonant");
		}	
	}
}