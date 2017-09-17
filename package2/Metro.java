package package2;
//-----------------------------------------------------
//Assignment #2
//Part: 2
//Written by: Yanran Zhao (40019784), Xintong Cheng (40021566)
//-----------------------------------------------------
/**
* @author Yanran Zhao (40019784), Xintong Cheng (40021566)
* @version Part2
*/

public class Metro extends CityBus{
	private int nbOfVechicels;
	private String city;
	
	public Metro(){
		super();
		nbOfVechicels=0;
		city="";
	}

	public Metro(double tp, int stops,long rount, int year, String line, String driver, int vec, String city){
		super(tp, stops, rount, year, line, driver);
		nbOfVechicels=vec;
		this.city=city;
	}
	
	public Metro(Metro me){
		setTicketPrice(me.getTicketPrice());
		setNbOfStops(me.getNbOfStops());
		setRouteNumber(me.getRouteNumber());
		setBeginYear(me.getBeginYear());
		setLineName(me.getLineName());
		setDriversName(me.getDriversName());
		nbOfVechicels=me.nbOfVechicels;
		city=me.city;
	}

	public String toString(){
		return "This Metro costs $"+getTicketPrice()+", has "+getNbOfStops()+" stops and "+getRouteNumber()+ " routes. It begins at "+getBeginYear()
				+". The line name is "+getLineName()+" , and driver is"+getDriversName()+". "+city+ " has "+nbOfVechicels+" vechicels.";
	}
	
	
	
	public int getNbOfVechicels() {
		return nbOfVechicels;
	}

	public void setNbOfVechicels(int nbOfVechicels) {
		this.nbOfVechicels = nbOfVechicels;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a Metro object
			Metro me = (Metro) x;
			return (this.getTicketPrice() == me.getTicketPrice() && this.getNbOfStops() == me.getNbOfStops() && this.getRouteNumber()==me.getRouteNumber()
					&& this.getBeginYear()==me.getBeginYear() && this.getLineName()==me.getLineName() && this.getDriversName()==me.getDriversName() 
					&& this.nbOfVechicels==me.nbOfVechicels && this.city==me.city);
		}
	}
	
	
	
	
	
	
}
