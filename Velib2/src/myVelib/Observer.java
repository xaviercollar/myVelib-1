package myVelib;

public interface Observer {
	public void updateStart(Station start);
	public void updateArrival(Station arrival);
}
