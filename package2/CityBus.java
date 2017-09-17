package package2;
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
public class CityBus extends PublicTransportation  {
	private long routeNumber;
	private int beginYear;
	private String lineName;
	private String driversName;
	
	public CityBus(){
		super();
		routeNumber=0;
		beginYear=0;
		lineName="";
		driversName="";
	}
	
	public CityBus(double tp, int stops,long rount, int year, String line, String driver){
		super(tp,stops);
		routeNumber=rount;
		beginYear=year;
		lineName=line;
		driversName=driver;
	}
	
	public CityBus(CityBus cbus){
		setTicketPrice(cbus.getTicketPrice());
		setNbOfStops(cbus.getNbOfStops());
		routeNumber=cbus.routeNumber;
		beginYear=cbus.beginYear;
		lineName=cbus.lineName;
		driversName=cbus.driversName;
	}

	
	public String toString(){
		return "This city bus costs $"+getTicketPrice()+", has "+getNbOfStops()+" stops and "+routeNumber+ " routes. It begins at "+beginYear
				+". The line name is "+lineName+" , and driver is "+driversName;
	}
	
	
	public long getRouteNumber() {
		return routeNumber;
	}

	public void setRouteNumber(long routeNumber) {
		this.routeNumber = routeNumber;
	}

	public int getBeginYear() {
		return beginYear;
	}

	public void setBeginYear(int beginYear) {
		this.beginYear = beginYear;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getDriversName() {
		return driversName;
	}

	public void setDriversName(String driversName) {
		this.driversName = driversName;
	}

	
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a CityBus object
			CityBus cb = (CityBus) x;
			return (this.getTicketPrice() == cb.getTicketPrice() && this.getNbOfStops() == cb.getNbOfStops() && this.routeNumber==cb.routeNumber
					&& this.beginYear==cb.beginYear && this.lineName==cb.lineName && this.driversName==cb.driversName);
		}
	}
	
	
	
	
}
