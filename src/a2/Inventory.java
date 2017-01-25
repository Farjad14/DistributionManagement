package a2;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Observable {
		protected ArrayList<Observer> observers;
		protected Product product;
		protected double availableQuantity;
		protected double backorderedQuantity;
		
		public Inventory(Product product) {
			this.product = product;
			this.observers = new ArrayList<Observer>();
			this.availableQuantity = 0.0;
			this.backorderedQuantity = 0.0;
		}
		
		protected void updateQuantities(double stock, double backord){
			this.availableQuantity = stock;
			this.backorderedQuantity = backord;
			notifyObserver();
			
		}

		@Override
		public void registerObserver(Observer o) {
			if(o != null){
				if(!observers.contains(o)){
					observers.add(o);
				}
			}
			
		}

		@Override
		public void removeObserver(Observer o) {
			if(o != null){
				if(observers.contains(o)){
					observers.remove(o);
				}
			}
			
		}


		@Override
		public void notifyObserver() {
			for(Observer o : observers){
				o.update(this.availableQuantity, this.backorderedQuantity);
			}
			
			
		}
		
		public String toString(){
			return product.toString() + " Available: " + this.availableQuantity +
					" Backorders: " + this.backorderedQuantity +
					 "\n" + observers;
			
		}

}
