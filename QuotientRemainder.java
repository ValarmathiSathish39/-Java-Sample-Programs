import java.util.*;
class QuotientRemainder{
	public static void main(String[] args){
		int num,quotient,remainder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		quotient = num / 2;
		remainder = num % 2;
		System.out.println("quotient"+quotient+" ," +  "remainder" + remainder);
	}
}