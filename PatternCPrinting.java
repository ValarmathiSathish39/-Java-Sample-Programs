import java.util.*;

public class PatternCPrinting {	
	public static void main(String args[]){ 
		int num = 4;		
		for (int i = 0;i < num;i++){
	        System.out.print("*");
	        for (int j = 0; j < (num-1); j++){
	            if (i== 0||i == num-1)
	                System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}