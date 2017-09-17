package package1;

//-----------------------------------------------------
//Assignment #2
//Part: 2
//Written by: Yanran Zhao (40019784), Xintong Cheng (40021566)
//-----------------------------------------------------
/**
 * @author Yanran Zhao (40019784), Xintong Cheng (40021566)
 * @version Part2
 */

public class PublicTransportation {
	private double ticketPrice;
	private int nbOfStops;
	
	public PublicTransportation(){
		ticketPrice=0;
		nbOfStops=0;
	}
	
	public PublicTransportation(double tp, int stops){
		ticketPrice=tp;
		nbOfStops=stops;
	}
	
	public PublicTransportation(PublicTransportation trans){
		this.ticketPrice=trans.ticketPrice;
		this.nbOfStops=trans.nbOfStops;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNbOfStops() {
		return nbOfStops;
	}

	public void setNbOfStops(int nbOfStops) {
		this.nbOfStops = nbOfStops;
	}
	
	public String toString(){
		return "The public transportation costs $"+ ticketPrice+ ", and has "+nbOfStops+" stops";
	}
	
	public boolean equals(Object x){
		if (x == null || this.getClass() != x.getClass())
			return false;
		else
		{
			// cast the passed object to a PublicTransportation object
			PublicTransportation pt = (PublicTransportation) x;
			return (this.ticketPrice == pt.ticketPrice && this.nbOfStops == pt.nbOfStops);
		}
	}
	
	
	
}
