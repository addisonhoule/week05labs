package week05;

public class Return {

	Item item;
	double change;
	
	Return() {
		
	}
	
		Return(Item item, double change) {
			this.item = item;
			this.change=change;
		
	}
		
		public Item getItem() {
			return item;
		}
		
		public void setItem(Item item) {
			this.item = item;
		}
		
		public double getChange() {
			return change;
		}
		
		public void setChange(double change) {
			this.change = change;
		}
		
		public void describe() {
			System.out.println("Item: " + item.getDescription());
			System.out.println("Change: " + change);
		}
	
}
