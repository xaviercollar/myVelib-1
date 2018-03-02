package myVelib;

import java.util.concurrent.TimeUnit;

public class VmaxCard extends Card{
	@Override
	public int getCharge(Location loc, User user) {
		long duration = Card.getDuration(loc.getTimeStart(), loc.getTimeStart(), TimeUnit.MINUTES);
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
	public static void main(String[] args) {
		long duration = 76;
		System.out.println(duration/60);
	}
}
