package myVelib;

import java.util.concurrent.TimeUnit;

public class NoCard extends Card{
	@Override
	public int getCharge(Location loc, User user) {
		if (loc.getArrival().getTypeStation().equals("Plus")) {
			this.setTimeCredit(this.getTimeCredit()+5);
		}
		long duration = Card.getDuration(loc.getTimeStart(), loc.getTimeStart(), TimeUnit.MINUTES);
		long hours = duration/60;
		if (loc.getBike().getTypeBike().equals("Mechanic")) {
			return (int) (hours)+1;
		}
		else
			if(loc.getBike().getTypeBike().equals("Electric")) {
				return 2*(int)hours+2;
			}
		return 0;
		}

}
