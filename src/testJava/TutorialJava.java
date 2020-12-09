package testJava;

// awal nama class harus capital
public class TutorialJava {
//	atribut variable
	public int x = 15;
	static int z = 20; //static variable : variable yg nilainya tetap, atau tidak bisa kita ubah
	private
	
//	method baru
	public void myMethod() {
		System.out.println("ini adalah method saya");
	}
	
//	static method
	static void staticMethod() {
		System.out.println("ini adalah static method");
	}
	
	public void method2() {
		System.out.println("ini method 2");
	}
	
//	method main
	public static void main(String[] args) {
		System.out.println("Tutorial Java"); //print
		TutorialJava myObj = new TutorialJava(); // create object untuk mewakili variable, method dlm class
		System.out.println(myObj.num); //print variable menggunakan object 
//		System.out.println(z); //print static variable
//		myObj.myMethod();
//		staticMethod();
//		myObj.method2();
		
		
	}
}
