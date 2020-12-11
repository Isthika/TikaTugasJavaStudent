package TikaRestaurant;

import java.util.Scanner;

public class ItemMenu implements Interface {
	private String menuName; 
	private int price;
	
	public ItemMenu(String menuName, int price) {
		super();
		this.menuName = menuName;
		this.price = price;
		
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ItemMenu() {
		super();
	}

	@Override
	public void printReceipt(int total, int total1, int bayar) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println();
		
		int ppn = (total / 100) * 10;
        System.out.println("PPN (10%) : " + ppn);
        total += ppn;
		System.out.println("You have to pay : Rp. " + total);// mencetak nilai dari objek total
		if (total > 100000) {
			System.out.println("Selamat Anda mendapatkan Voucher Beef/Chicken Spaghetti Gratis!");
		}
		System.out.print("Pay : Rp. ");
		bayar = scan.nextInt();
		
		total1 = (int) (bayar - total);
		System.out.println("Change : Rp. " + total1);// mencetak nilai dari objek total1
		System.out.println("Thank You For Ordering");
		System.out.println("===============================================================================");
	}
}
