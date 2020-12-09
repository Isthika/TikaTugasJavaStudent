package bangunDatar;

public class Segitiga implements BangunDatar {

	private final double alas, tinggi;
	
	public Segitiga(double a, double t) {
		alas = a;
		tinggi = t;
	}

	public double getAlas() {
		return alas;
	}

	public double getTinggi() {
		return tinggi;
	}

	@Override
	public double HitungLuas() {
		// TODO Auto-generated method stub
		return (alas*tinggi)/2;
	}

	@Override
	public double HitungKeliling() {
		double d;
		// TODO Auto-generated method stub
		d = (double)Math.sqrt((alas*alas)+(tinggi*tinggi));
		return (alas+tinggi+d);
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
	
	}
	
	
}
