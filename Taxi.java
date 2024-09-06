package taxibk;
public class Taxi implements Cloneable
{
	private char currentLocation = 'A';//places start from A to Z as samples 
	private int customerId;
	private int taxiId;
	private char pickupLocation;
	private char dropLocation;
	private int pickupTime;
	private int dropTime;
	private int earnings;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	public int getDropTime() {
		return dropTime;
	}

	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}
	
	public int getTaxiId() {
		return taxiId;
	}

	public void setTaxiId(int taxiId) {
		this.taxiId = taxiId;
	}

	public char getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(char currentLocation) {
		this.currentLocation = currentLocation;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public char getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(char pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public char getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(char dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(int pickupTime) {
		this.pickupTime = pickupTime;
	}
	public int getEarnings() {
		return earnings;
	}
	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "Your Taxi Number ID is  -->"+getTaxiId()+":"+"\n\n Current Location is  : " + currentLocation + "\n CustomerId  : " + customerId + " \n Pickup Location   : "
				+ pickupLocation + "\n DropLocation   : " + dropLocation + "\n Pickup Time   : " + pickupTime + "\n Drop Time   : "
				+ dropTime + "\n Your Earnings   : " + earnings;
	}
	
}