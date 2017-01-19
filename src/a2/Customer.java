package a2;

public class Customer {
	
	private int ID;
	private String name;

	public Customer(int ID, String name) {
		// TODO Auto-generated constructor stub
		this.setID(ID);
		this.name = name;
	}
	// Your full code for this class goes here
	
	public String toString(){
		return name;
	}

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
}