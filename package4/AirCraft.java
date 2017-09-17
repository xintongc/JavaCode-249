package package4;
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
public class AirCraft extends PublicTransportation {
	private ClassType classt;
	private MaintenanceType maintenancet;
	
	
	public AirCraft(){
		super();
		classt = ClassType.AIRLINE;
		maintenancet = MaintenanceType.WEEKLY;
	}
	
	public AirCraft(double tp, int stops, ClassType ct, MaintenanceType mt){
		super(tp,stops);
		classt=ct;
		maintenancet=mt;
	}
	
	public AirCraft(AirCraft ac){
		setTicketPrice(ac.getTicketPrice());
		setNbOfStops(ac.getNbOfStops());
		classt=ac.classt;
		maintenancet=ac.maintenancet;
	}
	
	
	public ClassType getClasst() {
		return classt;
	}

	public void setClasst(ClassType classt) {
		this.classt = classt;
	}

	public MaintenanceType getMaintenancet() {
		return maintenancet;
	}

	public void setMaintenancet(MaintenanceType maintenancet) {
		this.maintenancet = maintenancet;
	}

	public String toString(){
		return "This aircraft costs $"+ getTicketPrice()+ ", and has "+getNbOfStops()+" stops. The class type is "+classt
				+" and maintenance type is "+maintenancet;
	}
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a AirCraft object
			AirCraft ac = (AirCraft) x;
			return (this.getTicketPrice() == ac.getTicketPrice() && this.getNbOfStops() == ac.getNbOfStops() && this.classt==ac.classt
					&& this.maintenancet==ac.maintenancet);
		}
	}
	
}
