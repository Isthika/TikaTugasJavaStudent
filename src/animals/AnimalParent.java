package animals;

public class AnimalParent {
	private int noOfLegs;
	private String eats;
	
	public AnimalParent(String eats, int legs) {
		this.eats = eats;
		this.noOfLegs = legs;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOfLegs (int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	
	public String getEats(){
		return eats;
	}
	public void setEats(String eats){
		this.eats = eats;
	}
	
	
	
		
	}
	
