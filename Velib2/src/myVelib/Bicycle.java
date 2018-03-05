package myVelib;


public class Bicycle {
	private static Long compteurM=(long) 100000;
	private static Long compteurE=(long) 800000;
	private long bikeID;
	private String typeBike;
	public Bicycle(String typeBike) throws BadBicycleCreationException {
		super();
		if (typeBike=="Mechanical"){
		compteurM++;
		bikeID=compteurM;
		this.typeBike = typeBike;
		}
		else{
			if(typeBike=="Electrical") {
				compteurE++;
				bikeID=compteurE;
				this.typeBike = typeBike;
			}
		else {
			throw new BadBicycleCreationException(typeBike);
			}
			
		}
	}
	public long getBikeID() {
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
