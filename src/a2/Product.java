package a2;

public class Product {
	
	private int ID;
	private String name;

	public Product(int ID, String name) {
		this.setID(ID);
		this.setName(name);
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	// Your code for the product class goes here
}