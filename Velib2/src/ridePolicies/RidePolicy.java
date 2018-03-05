package ridePolicies;

public interface RidePolicy {
	public Station computeStart(Reseau reseau,String typevelo,GPScoord start, GPScoord end);
	public Station computeEnd(Reseau reseau,String typevelo,GPScoord start, GPScoord end);
}

