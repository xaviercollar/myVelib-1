package myVelib;

public abstract class Card {
	private int timeCredit;
	private String typeCard;
	
	
	
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
