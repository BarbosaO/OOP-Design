package parkinglot;
import constants.VehicleType;

public class Vehicle 
{
	private String licenseNumber;
	private final VehicleType type;
	private ParkingTicket ticket;
	
	public Vehicle(VehicleType aType)
	{
		type = aType;
	}
	
	public void assignTicket(ParkingTicket aTicket)
	{
		ticket = aTicket;
	}
}
