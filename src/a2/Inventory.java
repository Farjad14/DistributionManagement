package a2;

import java.util.ArrayList;
import java.util.List;

public class Inventory implements Observable {
		protected ArrayList<Observer> observers;
		protected Product product;
		protected double availableQuantity;
		protected double backorderedQuantity;
		
		public Inventory(Product flower) {
		}
		
		protected void updateQuantities(double stock, double backord){
			
		}

		@Override
		public void registerObserver(Observer o) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void removeObserver(Observer o) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void notifyObserver() {
			// TODO Auto-generated method stub
			
		}
		
		public String toString(){
			return null;
			
		}

	// Your code for Inventory class goes here

}
