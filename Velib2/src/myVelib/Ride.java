package myVelib;

public class Ride implements Observer {
	private GPScoord start;
	private GPScoord end;
	
	public void computeStart(Reseau res) {
		double dist =99999999999.9;
		Station startStation = null;
		for (Station stat : res.getStationList()) {
			if(stat.state.equals("On service")) {
				if(stat.availableBikeE()||stat.availableBikeM()) {
					if (dist>this.start.getDistance(stat.getPosition())) {
						dist=this.start.getDistance(stat.getPosition());
						startStation=stat;
					}
				}
			}
		}
		startStation.registerStartRide(this);
	}
	
	public void computeEnd(Reseau res) {
		double dist =99999999999.9;
		Station endStation = null;
		for (Station stat : res.getStationList()) {
			if(stat.state.equals("On service")) {
				if(stat.availableParkingSlot()) {
					if (dist>this.end.getDistance(stat.getPosition())) {
						dist=this.end.getDistance(stat.getPosition());
						endStation=stat;					
					}
				}
			}
		}
		endStation.registerStartRide(this);
	}
	
	
	public GPScoord getStart() {
		return start;
	}
	public void setStart(GPScoord start) {
		this.start = start;
	}
	public GPScoord getEnd() {
		return end;
	}
	public void setEnd(GPScoord end) {
		this.end = end;
	}
	@Override
	public void updateStart(Station start) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateArrival(Station arrival) {
		// TODO Auto-generated method stub
		
	}
	
	
}
