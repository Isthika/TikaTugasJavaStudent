package bangunDatar;

public class Persegi implements BangunDatar {
	
	private final double sisi;
	public Persegi (double s) {
		sisi = s;
	}
	public double getSisi() {
		return sisi;
	}
	@Override
	public double HitungLuas() {
		// TODO Auto-generated method stub
		return (sisi*sisi);
	}
	@Override
	public double HitungKeliling() {
		// TODO Auto-generated method stub
		return (sisi*sisi*sisi*sisi);
	}
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

}
