package myVelib;

import java.util.Calendar;
import java.util.Date;

public class Location {
	private Date timeStart;
	private Date timeEnd;
	private Station start;
	private Station arrival;
	private Bicycle bike;
	
	public Location(Station start, Bicycle bike) {
		this.timeStart=Calendar.getInstance().getTime();
		this.start=start;
		this.bike=bike;
	}
	
	public void returnBike(Station end) {
		this.arrival=end;
		this.timeEnd=Calendar.getInstance().getTime();
	}
	
	public Date getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}
	public Date getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}
	public Station getStart() {
		return start;
	}
	public void setStart(Station start) {
		this.start = start;
	}
	public Station getArrival() {
		return arrival;
	}
	public void setArrival(Station arrival) {
		this.arrival = arrival;
	}
	public Bicycle getBike() {
		return bike;
	}
	public void setBike(Bicycle bike) {
		this.bike = bike;
	}
	
	

}
