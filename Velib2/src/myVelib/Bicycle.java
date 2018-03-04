package myVelib;


public class Bicycle {
	protected static Long compteur=(long) 0;
	protected Long bikeID;
	protected String typeBike;
	public Bicycle(String typeBike) throws BadBicycleCreationException {
		super();
		if (typeBike=="Mechanical" || typeBike=="Electrical"){
		compteur=compteur+1;
		bikeID=compteur;
		this.typeBike = typeBike;
		}
		else{
			throw new BadBicycleCreationException(typeBike);
		}
	}
	public Long getBikeID() {
		return bikeID;
	}
	public String getTypeBike() {
		return typeBike;
	}
	@Override
	public String toString() {
		return "Bicycle [bikeID=" + bikeID + ", typeBike=" + typeBike + "]";
	}
	
	
}
