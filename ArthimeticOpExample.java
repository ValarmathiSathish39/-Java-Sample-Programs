/* Evaluate the following expression on paper and on program and understand the
difference int a=10,b=5;
i) ++a-b–- ii) a%b++ iii) a*=b+5 iv) x=69>>>2 
++a-b-- = 11-5 = 6
a = 11
b = 4
a%b++ = 11%4 = 3
a= 11
b = 5

a* = b+5 => a = 11 * 5+5 => 11*10= 110 

x=69>>2   = 1000101 >> 2 = 0010001 => 17

a+=a++ + ++a + –a + a–; when a=28
*/
import java.util.*;
class ArthimeticOpExample{	
	public static void main(String[] args){
		int a=10,b=5;		
		System.out.println("++a-b-- = " + (++a-b--) + " a=" + a + " b=" + b);
		System.out.println("(a%b++) = "+ (a%b++)+ " a=" + a + " b=" + b);
		a*=b+5;
		System.out.println("(a*=b+5) = "+a);
		int x=69 >> 2;
		System.out.println("x="+x);
		
		System.out.println("=========================================");
		
		a = 28;
		a += a++ + ++a + -a + a--;
		System.out.println("a value = "+a);	
		
		System.out.println("=========================================");
		
		x = 22;
		x = x++ * 2 + 3 * -x;
		// System.out.println(x++ * 2+3 + "." + -x);
		System.out.println("x value = "+x);
		
		System.out.println("=========================================");
		
		int y = 10;
		int z = (++y * (y++ + 5));
		System.out.println("z value = "+z);
		
		x= 10;
		int x1=++x - x++ + -x;
		System.out.println("x1 value = "+x1);
	}		
} 