package SoalLatihan;

import java.util.Scanner;

public class Child extends Parent {

public void volumeKubus(double sisi) {
double volumeKubus = sisi * sisi * sisi;
System.out.println(volumeKubus);
}
public static void main(String[] args) {
	
	Scanner scanInput = new Scanner(System.in);
	
	System.out.print("Side : ");
	double alasPersegi = scanInput.nextDouble();
	
	System.out.print("Alas Segitiga : ");
	double alasSegitiga = scanInput.nextDouble();
	
	System.out.print("Tinggi Segitiga : ");
	double tinggiSegitiga = scanInput.nextDouble();
	
	System.out.print("Sisi Kubus : ");
	double sisiKubus = scanInput.nextDouble();
	
	Child child = new Child();
	
	child.luasPersegi(alasPersegi);
	child.luasSegitiga(alasSegitiga, tinggiSegitiga);
	child.volumeKubus(sisiKubus);
	
}
}
