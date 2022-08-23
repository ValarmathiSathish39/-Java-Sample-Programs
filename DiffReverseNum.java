import java.util.*;
class DiffReverseNum{
	public static void main(String[] args){
		int number,reverse;
		DiffReverseNum diffReverseNum = new DiffReverseNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		reverse = diffReverseNum.reverseNum(number);
		System.out.println("The difference of given number and its reverse number"+ (number - reverse));
	}
	public int reverseNum(int num){
	int digit,reverse=0;
		for (;num>0;num=num/10){
			digit = num%10;
			reverse = reverse *10 + digit;	
			// System.out.println(reverse+digit);	
		}
		return reverse;
	}
	
}