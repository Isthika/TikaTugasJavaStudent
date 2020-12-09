package animals;

public class AnimalInheritance {
	public static void main(String[] args) {
		Cat cat = new Cat("milk", 4);

		System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
		System.out.println("Cat eats " + cat.getEats());
		
	}

}
