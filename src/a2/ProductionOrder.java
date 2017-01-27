package a2;

public class ProductionOrder implements Observer, DisplayElement {
	
	private static int orderSequence;
	protected int ID;
	protected double minQuantity;
	protected Observable inventory;

	public ProductionOrder(int minQuantity, Observable inventory) {
		//Setup
		this.minQuantity = (double)minQuantity;
		this.inventory = inventory;
		//New order
		orderSequence++;
		this.ID = orderSequence;
		//Register the order
		inventory.registerObserver(this);
		//Update the stock
		this.update(((Inventory)inventory).availableQuantity, ((Inventory)inventory).backorderedQuantity);
	}

	@Override
	public void display(double dispQty) {
		System.out.println("Production Order# "+ this.ID +" , item "
				+ ((Inventory)inventory).product.name + " , produced "
				+ dispQty);
	}

	@Override
	public void update(double availQty, double ordQty) {
		double demand = ordQty - availQty;
		if(demand>=minQuantity){
			//We need to make more product
			((Inventory)inventory).updateQuantities(((Inventory)inventory).availableQuantity + demand, 
					((Inventory)inventory).backorderedQuantity);
		}
		
		
	}
	
	public String toString(){
		return "PO" + this.ID + " " + ((Inventory)inventory).product.name 
				+ " " + minQuantity;
	}
}
