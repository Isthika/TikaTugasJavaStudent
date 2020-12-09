package bangunDatar;

public class MainBangunDatar {

	public static void main(String[] args) {
		BangunDatar b[] = new BangunDatar[4];
		
//		object dari line 9-12
		PersegiPanjang pp = new PersegiPanjang(5, 10);
		Segitiga sg = new Segitiga (3,4);
		Persegi p = new Persegi (5);
		Lingkaran lg = new Lingkaran (10);
		
		b[0] = pp;
		b[1] = sg;
		b[2] = p;
		b[3] = lg;
		
		for (BangunDatar a : b) {
			a.displayInfo();
		
		}
	}
}
