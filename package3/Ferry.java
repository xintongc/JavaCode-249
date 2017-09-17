package package3;
import package1.PublicTransportation;
//-----------------------------------------------------
//Assignment #2
//Part: 2
//Written by: Yanran Zhao (40019784), Xintong Cheng (40021566)
//-----------------------------------------------------
/**
* @author Yanran Zhao (40019784), Xintong Cheng (40021566)
* @version Part2
*/
public class Ferry extends PublicTransportation {
	private int buildYear;
	private String shipName;
	
	public Ferry(){
		super();
		buildYear=0;
		shipName="";
	}
	
	public Ferry(double tp, int stops, int year, String ship){
		super(tp,stops);
		buildYear=year;
		shipName=ship;
	}
	
	
	public Ferry(Ferry fe){
		setTicketPrice(fe.getTicketPrice());
		setNbOfStops(fe.getNbOfStops());
		buildYear=fe.buildYear;
		shipName=fe.shipName;
	}

	public String toString(){
		return "This Ferry costs $"+getTicketPrice()+", has "+getNbOfStops()+" stops."+ "The ferry's name is "+shipName+", build at "+buildYear;
	}
	
	
	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a Ferry object
			Ferry fe = (Ferry) x;
			return (this.getTicketPrice() == fe.getTicketPrice() && this.getNbOfStops() == fe.getNbOfStops() && this.buildYear==fe.buildYear
					&& this.shipName==fe.shipName);
		}
	}
	
	
}
