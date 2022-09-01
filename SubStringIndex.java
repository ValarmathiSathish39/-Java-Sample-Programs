class SubStringIndex {     
    public static void main(String args[])
    {
        String s1 = "testing12";
        String s2 = "123";
		char ch = s2.charAt(0);
		int res = -1;
		int m = s1.length()-1; 
		int n = s2.length()-1;		
		for (int i = 0; i < m; i++) {
            if(s1.charAt(i) == ch){
				String subString = s1.substring(i,i+n);
				if(s2.equals(subString)){
					res = i;
				}
			}
			
        }
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index "+ res);
    }
}