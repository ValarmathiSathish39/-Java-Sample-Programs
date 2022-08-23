import java.util.*;
class bitwiseOp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int res,option,num1 = 7,num2 = 7;		 		
		do{
			System.out.println("1.Bitwise AND");
			System.out.println("2.Bitwise OR");
			System.out.println("3.Bitwise XOR");
			System.out.println("4.Bitwise Complement");
			System.out.println("5.Bitwise Left shift");
			System.out.println("6.Bitwise Right shift");
			System.out.println("7. Exit");	
			System.out.println("Enter the option");	
			option = sc.nextInt();
			if (option >=1 && option <= 3){
				System.out.println("Enter two numbers");
				num1 = sc.nextInt();
				num2 = sc.nextInt();
			}else if(option >=4 && option < 7){
				System.out.println("Enter a numbers");
				num1 = sc.nextInt();				
			}	
			switch(option){
				case 1:
					res = num1 & num2;
					System.out.println(res);					
					break;
				case 2:
					res = num1 | num2;
					System.out.println(res);
					break;
				case 3:
					res = num1 ^ num2;
					System.out.println(res);
					break;
				case 4: 
					res = ~num1;
					System.out.println(res);					
					break;
				case 5:
					res = num1 << 2;
					System.out.println(res);
					break;
				case 6: 
					res = num1 >> 2;
					System.out.println(res);
					break;
				case 7:
					break;
			}					
		}while(option != 7);
		
	}
}