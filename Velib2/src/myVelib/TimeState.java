package myVelib;

import java.time.LocalDateTime;
/**
 * Cette classe permet de créer un historique des états du ParkingSlot, elle se compose de deux attributs un état sous la forme d'un booleen
 * et une date de départ.
 * @author xavier
 *
 */
public class TimeState {
	protected boolean occupied;
	protected LocalDateTime start;
	public TimeState(boolean occupied, LocalDateTime start) {
		super();
		this.occupied = occupied;
		this.start = start;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public LocalDateTime getStart() {
		return start;
	}
}
