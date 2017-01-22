package a2;

public class SalesOrder implements Observer, DisplayElement {
	private int orderSequence;
	protected int ID;
	protected Customer customer;
	protected double quantity;
	protected Observable inventory;

	public SalesOrder(Customer wm, int i, Inventory flowerInv) {
		// TODO Auto-generated constructor stub
	}
	// Your code for SalesOrder class goes here

	@Override
	public void display(double q) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(double availQty, double ordQty) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean ship(double availableQuantity){
		return false;
	}
	
	public String toString(){
		return null;
	}
}