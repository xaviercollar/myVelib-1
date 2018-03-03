package myVelib;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Card {
	private int timeCredit;
	private String typeCard;
	
	public int getCharge(Location loc, User user) {
		return 1;
	}
	
	/**
	 * This method outputs as a long the difference in minutes between two dates. It is used to compute the rental time of a location
	 * 
	 */
	public static long getDuration(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime()-date1.getTime();
		return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
	}
	
	public int getTimeCredit() {
		return timeCredit;
	}
	public void setTimeCredit(int timeCredit) {
		this.timeCredit = timeCredit;
	}
	public String getTypeCard() {
		return typeCard;
	}
	public void setTypeCard(String typeCard) {
		this.typeCard = typeCard;
	}
	
	
}
