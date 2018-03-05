package myVelib;


public class Bicycle {
	protected static Long compteurM=(long) 10000;
	private static Long compteurE=(long) 80000;
	protected long bikeID;
	protected String typeBike;
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
