package TikaRestaurant;

import java.util.Scanner;

public class CashierMain {
	public static void main(String[] args) {

		System.out.println(" Tika's Restaurant ");
		System.out.println(" Sekali Makan Ketagihan");
		System.out.println(" Coba Dan Dapatkan Voucher Makanan Gratis");

		Scanner scan = new Scanner(System.in);
		int a = 0;
		int total = 0, total1 = 0,  bayar = 0  ;
		int price = 0;
		
		ItemMenu mainMenu = new ItemMenu(); 
		ItemMenu b =  new ItemMenu("Beef/Chicken Spaghetti + Ice Tea", 20000);
		ItemMenu c =  new ItemMenu("Beef/Chicken Lasagna + Ice Tea", 18000);
		ItemMenu d =  new ItemMenu("Beef/Chicken Rice Oriental + Ice Tea", 17000);
		ItemMenu e =  new ItemMenu("Fried Rice + Ice Tea", 15000);
		ItemMenu f =  new ItemMenu("Beef/Chicken Spaghetti", 18000);
		ItemMenu g =  new ItemMenu("Beef/Chicken Lasagna", 17000);
		ItemMenu h =  new ItemMenu("Beef/Chicken Rice Oriental", 15000);
		ItemMenu i =  new ItemMenu("Fried Rice", 13000);
		ItemMenu j =  new ItemMenu("Tea (Cold/Hot)", 3000);
		ItemMenu k =  new ItemMenu("Water", 3000);
		
		System.out.println("*****-------------------------Tika's Restarurant-------------------------*****");
		
		System.out.println("| *-Menu-* |");
		System.out.println("|>Main Menu |");
		System.out.println("|1."+  b.getMenuName() + "...........................Rp."+ b.getPrice() + "|");
		System.out.println("|2."+  c.getMenuName() + "...........................Rp."+ c.getPrice() + "|");
		System.out.println("|3."+  d.getMenuName() + "...........................Rp."+ d.getPrice() + "|");
		System.out.println("|4."+  e.getMenuName() + "...........................Rp."+ e.getPrice() + "|");
	
		System.out.println("|>Ala Carte |");
		System.out.println("|5."+  f.getMenuName() + "...........................Rp."+ f.getPrice() + "|");
		System.out.println("|6."+  g.getMenuName() + "...........................Rp."+ g.getPrice() + "|");
		System.out.println("|7."+  h.getMenuName() + "...........................Rp."+ h.getPrice() + "|");
		System.out.println("|8."+  i.getMenuName() + "...........................Rp."+ i.getPrice() + "|");
		
		System.out.println("|> Drinks |");
		System.out.println("|9."+  j.getMenuName() + "...........................Rp."+ j.getPrice() + "|");
		System.out.println("|10."+ k.getMenuName() + "...........................Rp."+ k.getPrice() + "|");
		System.out.println("Memesan seharga Rp 100000,Anda mendapatkan Beef/Chicken Spaghetti Gratis! ");
		
		for (String z = "y"; z.equals("y") || z.equals("Y");) {
			System.out.print("Please Select Number of Menu : ");
			a = scan.nextInt();

			if (a == 1) {
				System.out.println("You Select Beef/Chicken Spaghetti + Ice Tea Rp." + b.getPrice());
				price = price + b.getPrice();
			} else if (a == 2) {
				System.out.println("You Select Pilih Beef/Chicken Lasagna + Ice Tea Rp." + c.getPrice());
				price = price + c.getPrice();
			}

			else if (a == 3) {
				System.out.println("You Select Beef/Chicken Rice Oriental + Ice Tea Rp." + d.getPrice());
				price = price + d.getPrice();
			} else if (a == 4) {
				System.out.println("You Select Pilih Fried Rice + Ice Tea Rp." + e.getPrice());
				price = price + e.getPrice();
			} else if (a == 5) {
				System.out.println("You Select Pilih Beef/Sausage Spaghetti Rp." + f.getPrice());
				price = price + f.getPrice();
			}

			else if (a == 6) {
				System.out.println("You Select Meatballs Beef Mushroom Sauce Rp." + g.getPrice());
				price = price + g.getPrice();
			}

			else if (a == 7) {
				System.out.println("You Select Fried Rice Black Paper Rp." + h.getPrice());
				price = price + h.getPrice();
			}

			else if (a == 8) {
				System.out.println("You Select Rice Oriental Chicken/Beef Rp." + i.getPrice());
				price = price + i.getPrice();
			} else if (a == 9) {
				System.out.println("You Select Tea (Cold/Hot) Rp." + j.getPrice());
				price = price + j.getPrice();
			} else if (a == 10) {
				System.out.println("You Select Water Rp." + k.getPrice());
				price = price + k.getPrice();

			}
					System.out.print("Would you like to add another menu? Y/N : ");
					z = scan.next();
				}
			mainMenu.printReceipt(price, total1, bayar);
				
			}
		
	}

