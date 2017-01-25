package a2;

public class Customer {
	
	protected int ID;
	protected String name;

	public Customer(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	// Your full code for this class goes here
	
	public String toString(){
		return ID + " " + name;
	}
}