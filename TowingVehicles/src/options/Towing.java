package options;

import transport.Vehicle;

public interface Towing 
{
	public void towing(Vehicle vehicleBeingTowed);
	public void towCapacity();
	public boolean canTow(Vehicle vehicle);
}
