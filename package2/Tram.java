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
public class Tram extends CityBus{
	private int maxSpeed;
	
	public Tram(){
		super();
		maxSpeed=0;
	}
	
	public Tram(double tp, int stops,long rount, int year, String line, String driver,int mSpeed){
		super(tp, stops, rount, year, line, driver);
		maxSpeed=mSpeed;
	}
	
	public Tram(Tram tr){
		setTicketPrice(tr.getTicketPrice());
		setNbOfStops(tr.getNbOfStops());
		setRouteNumber(tr.getRouteNumber());
		setBeginYear(tr.getBeginYear());
		setLineName(tr.getLineName());
		setDriversName(tr.getDriversName());
		maxSpeed=tr.maxSpeed;
	}

	public String toString(){
		return "This Tram costs $"+getTicketPrice()+", has "+getNbOfStops()+" stops and "+getRouteNumber()+ " routes. It begins at "+getBeginYear()
				+". The line name is "+getLineName()+" , and driver is"+getDriversName()+". It�s maximun speed is "+maxSpeed+"km/h.";
	}
	
	
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a Tram object
			Tram tr = (Tram) x;
			return (this.getTicketPrice() == tr.getTicketPrice() && this.getNbOfStops() == tr.getNbOfStops() && this.getRouteNumber()==tr.getRouteNumber()
					&& this.getBeginYear()==tr.getBeginYear() && this.getLineName()==tr.getLineName() && this.getDriversName()==tr.getDriversName() 
					&& this.maxSpeed==tr.maxSpeed);
		}
	}
	
}
