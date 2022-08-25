// Program to Check Whether a Character is an Alphabet or not

import java.util.*;
class AlphaCheck{
	public static void main(String[] args){
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		c = sc.next().charAt(0);
		if ((c >= 'A' && c<='z') || (c>='a' && c <= 'z')){
			System.out.println("Alphabet");
		} else 
			System.out.println("Not an Alphabet");
	}
}