import java.util.*;
import java.lang.*;

public class ChatacterPrinting {	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String str = "b3c6d15";
		char c =' ';
        char[] charArray = str.toCharArray();
    
        for(int i = 0; i< charArray.length;i++){
            if(Character.isDigit(charArray[i])){
                c = charArray[i-1];
                while(i< charArray.length && Character.isDigit(charArray[i])){
                   num = (num *10)  + (charArray[i]-48);				   
                   i++;
				}
			}
            for(int x = 0; x< num;x++){
				System.out.print(c);    
            }
            num = 0;        
        }
    }
}