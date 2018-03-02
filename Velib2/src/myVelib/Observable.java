package myVelib;

public interface Observable {
	public void registerStartRide(Ride ride);
	
	public void registerEndRide(Ride ride);
	
	public void removeRide(Ride ride);
	
	public void notifyStartRide();
	
	public void notifyEndRide();
}
