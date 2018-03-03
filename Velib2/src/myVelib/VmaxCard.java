package myVelib;

import java.util.concurrent.TimeUnit;

public class VmaxCard extends Card{
	@Override
	public int getCharge(Location loc, User user) {
		if(loc.getArrival().typeStation.equals("Plus")) {
			this.setTimeCredit(getTimeCredit()+5);
			user.setEarnedCredits(user.getEarnedCredits()+5);
		}
		long duration = Card.getDuration(loc.getTimeStart(), loc.getTimeEnd(), TimeUnit.MINUTES);
		long hours = duration/60;
		long min = duration%60;
		if(hours<1) {
			return 0;
		}
		if (min<this.getTimeCredit()) {
			this.setTimeCredit(getTimeCredit()-(int)min);
			hours--;
		}
		return (int)hours;
	}
	
}
