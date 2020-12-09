package SoalLatihan;

public class Parent {

		private double luas;
		
		public void luasSegitiga(double alas, double tinggi) {
			setLuas((alas*tinggi)/2);
			System.out.println("Luas segitiga : " + getLuas());
		}
		public void luasPersegi(double side) {
			setLuas(side*side);
			System.out.println("Luas persegi : " + getLuas());
		}
		
		public double getLuas() {
			return luas;
		}
		
		public void setLuas(double luas) {
			this.luas = luas;
		}
}
