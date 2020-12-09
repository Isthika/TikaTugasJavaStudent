package bangunDatar;

public class PersegiPanjang implements BangunDatar {
private final double panjang, lebar;

	public PersegiPanjang (double p, double l) {
		panjang = p;
		lebar = l;
	}

	public double getPanjang() {
		return panjang;
	}

	public double getLebar() {
		return lebar;
	}

	@Override
	public double HitungLuas() {
		// TODO Auto-generated method stub
		return (panjang*lebar);
	}

	@Override
	public double HitungKeliling() {
		// TODO Auto-generated method stub
		return (panjang+lebar);
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
		System.out.println(this.HitungKeliling());
		System.out.println(this.HitungLuas());
	}
	
	
}
