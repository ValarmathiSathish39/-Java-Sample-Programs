import java.util.*; 
import java.lang.Math.*;  
public class QuadraticEquation{  
	public static void main(String[] Strings){  
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the value of a: ");  
		int a = input.nextInt();  
		System.out.print("Enter the value of b: ");  
		int b = input.nextInt();  
		System.out.print("Enter the value of c: ");  
		int c = input.nextInt();  
		int d= (b * b) - (4 * a * c); 
		double sqrtval = Math.sqrt(Math.abs(d)); 		
		if (d > 0){  
			System.out.println("The roots of the equation are real and different. \n");  
			System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
		}else if (d == 0){  
			System.out.println("The roots of the equation are real and same. \n");  
			System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));
		}else {  
			System.out.println("The roots of the equation are complex and different. \n");  
			System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
		}  
	}  
} 			