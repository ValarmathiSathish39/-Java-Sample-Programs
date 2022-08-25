import java.util.*;
class CharToAscii{
	public static void main(String[] args){
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		c = sc.next().charAt(0);
		if ((c >= 'A' && c<='z') || (c>='a' && c <= 'z')){
			System.out.println((int)c);
		}	
	}
}