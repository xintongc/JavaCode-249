package package1;
//-----------------------------------------------------
//Assignment #2
//Part: 2
//Written by: Yanran Zhao (40019784)
//-----------------------------------------------------
import package2.CityBus;
import package2.Metro;
import package2.Tram;
import package3.Ferry;
import package4.AirCraft;
import package4.ClassType;
import package4.MaintenanceType;
//-----------------------------------------------------
//Assignment #2
//Part: 2
//Written by: Yanran Zhao (40019784), Xintong Cheng (40021566)
//-----------------------------------------------------
/**
* @author Yanran Zhao (40019784), Xintong Cheng (40021566)
* @version Part2
*/
public class driver {

	/**create a new array with the same length as the passed array, but this method is failing to 
	 * copy an array because it creates PublicTranportation objects which call PublicTransprotation 
	 * copy constructor. 
	 * The correct way should be using clone() method that each object calls a clone
	 * method, and polymorphism will excute the correct method according its own class to make the program run.
	 * */
	
	
	public static PublicTransportation[] copyCityBuss(PublicTransportation[] pt)
	{
		PublicTransportation[] ptNew = new PublicTransportation[pt.length];	
		for (int i = 0; i < ptNew.length; i++)	
		{
			ptNew[i] = new PublicTransportation(pt[i]);	
		} 
		return ptNew;
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicTransportation tr1=new PublicTransportation(3.25,20);
		CityBus cb1= new CityBus(2.25,18,4,1995,"cityCenter","John");
		Tram tram1 = new Tram(8.5,15,22,1955,"Green","Geroge",70);
		Metro me1= new Metro(3.5,10,30,1960,"Orange","Alex",100,"Montreal");
		Ferry fe1=new Ferry(1000,2,2000,"star");
		AirCraft ac1 = new AirCraft(2000,1, ClassType.HELICOPTER, MaintenanceType.MONTHLY);
	
		
		PublicTransportation tr2=new PublicTransportation(5,15);
		CityBus cb2= new CityBus(cb1);
		Tram tram2 = new Tram(tram1);
		Metro me2= new Metro(2.5,15,25,2001,"red","Don",150,"Paris");
		Ferry fe2=new Ferry(1500,4,2010,"shark");
		AirCraft ac2 = new AirCraft(3500,2, ClassType.GLIDER, MaintenanceType.YEARLY);
		
		
		PublicTransportation transportation [] = new PublicTransportation[12];
		transportation[0]=tr1;
		transportation[1]=cb1;
		transportation[2]=tram1;
		transportation[3]=me1;
		transportation[4]=fe1;
		transportation[5]=ac1;
		transportation[6]=tr2;
		transportation[7]=cb2;
		transportation[8]=tram2;
		transportation[9]=me2;
		transportation[10]=fe2;
		transportation[11]=ac2;
		
		System.out.println("Here is the list of objects");
		for (int i = 0; i < transportation.length; i++)
		{
			System.out.print((i+1)+": ");
			System.out.println(transportation[i]);
		}
	
	    

	    PublicTransportation[] ptInv = copyCityBuss(transportation);
	    System.out.println("\nHere is the list of copy objects by copy constructors in that inventory");
		for (int i = 0; i < ptInv.length; i++)
		{
			System.out.print((i+1)+": ");
			System.out.println(ptInv[i]);
		}

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
