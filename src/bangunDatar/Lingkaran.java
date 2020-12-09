package bangunDatar;

public class Lingkaran implements BangunDatar{

	private final double radius;
	private final double PI = 3.14;
	
	public Lingkaran (double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double HitungLuas() {
		// TODO Auto-generated method stub
		return (PI*radius*radius);
	}

	@Override
	public double HitungKeliling() {
		// TODO Auto-generated method stub
		return (2*PI*radius);
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
