import java.util.*;
class ReverseString{
	public static void main(String[] args){
		String str ="I love you";
		String reverse = "";
		int length = str.length();
		for (int i = length-1; i >=0; i--) {
            if((int)str.charAt(i)==32){				
				String temp = str.substring(i+1,length);
				reverse = reverse + " " + temp; 
				length = i;
			}	
			if(i==0){
				String temp = str.substring(i,length);
				reverse = reverse + " " + temp; 
			}	
        }
		System.out.println(reverse);
	}
}