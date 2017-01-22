package a2;

public class Customer {
	
	protected int ID;
	protected String name;

	public Customer(int ID, String name) {
		// TODO Auto-generated constructor stub
		this.ID = ID;
		this.name = name;
	}
	// Your full code for this class goes here
	
	public String toString(){
		return name;
	}
}