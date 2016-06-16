package it.polimi.psd.database;

/**
 * @author edoardesd
 *	Drug's attributes
 */
public class Drug {
	String name;
	int quantity;
	int trackingNumber;
	
	
	public int getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		String newName = name.toLowerCase();
		String nameUp = newName.substring(0, 1).toUpperCase() + newName.substring(1);
		this.name = nameUp;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
}
	
	
	@Override
	public String toString() {
		return "Drug [name=" + this.name + "]";
	}
		

}
