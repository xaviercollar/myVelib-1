package myVelib;
import java.util.*;

public class User {
	private String name;
	private String firstName;
	private long userID;
	private int rideNumber;
	private int totalTime;
	private double totalCharges;
	private int earnedCredits;
	static Random gen = new Random();
	
	public User(String name, String firstName) {
		this.userID=gen.nextLong();
		this.firstName=firstName;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public int getRideNumber() {
		return rideNumber;
	}
	public void setRideNumber(int rideNumber) {
		this.rideNumber = rideNumber;
	}
	public int getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	public double getTotalCharges() {
		return totalCharges;
	}
	public void setTotalCharges(double totalCharges) {
		this.totalCharges = totalCharges;
	}
	public int getEarnedCredits() {
		return earnedCredits;
	}
	public void setEarnedCredits(int earnedCredits) {
		this.earnedCredits = earnedCredits;
	}
	
	public void getStatistics() {
		System.out.println("User "+userID+": "+firstName+" "+name);
		System.out.println("Number of locations: "+rideNumber);
		System.out.println("Total location time: "+totalTime+" minutes");
		System.out.println("Total charges payed: "+totalCharges+"€");
		System.out.println("Earned Credits: "+earnedCredits+" minutes");
	
	}
}
