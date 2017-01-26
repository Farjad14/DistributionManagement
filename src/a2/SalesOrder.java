package a2;

public class SalesOrder implements Observer, DisplayElement {
	private static int orderSequence;
	protected int ID;
	protected Customer customer;
	protected double quantity;
	protected Observable inventory;

	public SalesOrder(Customer customer, double quantity, Observable inventory) {
		this.customer = customer;
		this.quantity = quantity;
		this.inventory = inventory;
		orderSequence++;
		this.ID = orderSequence;
		Inventory inven = ((Inventory)this.inventory); // to make things cleaner
		//if we have enough product, ship it out immediately
		if(this.ship(((Inventory)inventory).availableQuantity)){
			display(quantity);
			inven.updateQuantities(
					inven.availableQuantity - this.quantity,
					inven.backorderedQuantity);
		}
		//We don't have enough, so keep track of the order(backordered)
		else{
			inven.registerObserver(this);
			inven.updateQuantities(
					inven.availableQuantity,
					inven.backorderedQuantity + this.quantity);
		}
		
	}

	@Override
	public void display(double displayQuantity) {
		System.out.println("Shipping Order# "+ this.ID + " " +  this.customer.name + " , Product: "
				+ ((Inventory)this.inventory).product.name + " , Quantity: "
				+ displayQuantity);
		
	}

	@Override
	public void update(double availQty, double ordQty) {
		//If we have enough, ship out the product and remove the order
		if(this.ship((availQty))){
			display(this.quantity);
			this.inventory.removeObserver(this);
			((Inventory)this.inventory).updateQuantities(
					((Inventory)this.inventory).availableQuantity - this.quantity,
					((Inventory)this.inventory).backorderedQuantity - this.quantity);
		}
		
	}
	
	private boolean ship(double availableQuantity){
		if(availableQuantity>=this.quantity){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		return "SO" + ID + " " + ((Inventory)this.inventory).product.name +" " + this.quantity;
	}
}