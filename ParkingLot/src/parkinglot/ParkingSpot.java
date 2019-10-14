package parkinglot;

import constants.ParkingSpotType;

public class ParkingSpot 
{
	private String number;
	private boolean free;
	private Vehicle vehicle;
	private final ParkingSpotType type;
	
	public ParkingSpot(ParkingSpotType aType)
	{
		type = aType;
	}
	
	public boolean assignVehicle(Vehicle aVehicle)
	{
		vehicle = aVehicle;
	}
	
	public boolean removeVehicle()
	{
		this.vehicle = null;
		free= true;
	}
}
