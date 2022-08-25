import java.util.*;
class StaticExample{
	int i=2;	
	final static int a = 10;
	static int b;
	static {
		b = a * 10;
	}
	static void method1(){
		System.out.println("A,B = "+a+","+b);
		// StaticExample staticExample = new StaticExample();
		// System.out.println(i);
	}
		
	public static void main(String[] args){
		/*
		1) If you need to do the computation in order to initialize your static variables, 
		you can declare a static block that gets executed exactly once, when the class is first loaded.
		2)Static block and static variables are executed in the order they are present in a program.
		3)Static method cannot refer to this or super in any way. 
		4)A class can be made static only if it is a nested class.
		5)a static class cannot access non-static members of the Outer class.
		static class can access only the static members of the outer class. 	
		*/ 
		System.out.println("a = "+a+",b = "+b);
		method1();
		StaticClass staticClass = new StaticClass();
		staticClass.display();	
		staticClass.disply();	
	}
	
	static class StaticClass{
		StaticExample staticExample = new StaticExample();
		public void display(){
			System.out.println("Nested static class non static method");
			System.out.println(" A value"+a);
			System.out.println("i value"+staticExample.i);
		}
		public static void disply(){
			System.out.println("Nested static class , static method");
		}
	}
}