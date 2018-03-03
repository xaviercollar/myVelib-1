package myVelib;

public interface Observable {
	public void registerStartRide(Location loc);
	
	public void registerEndRide(Location loc);
	
	public void removeRide(Location loc);
	
	public void notifyStartRide();
	
	public void notifyEndRide();
}
