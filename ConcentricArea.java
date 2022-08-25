class ConcentricArea{  
	static final double pi = 3.1415926536;
	static double calculateArea(int x, int y){		
		double arx = pi * x * x;
		double ary = pi * y * y;
		return arx - ary;
	}
 
	public static void main (String[] args){
		int x = 2;
		int y = 1;
		System.out.println (calculateArea(x, y));
	}
}