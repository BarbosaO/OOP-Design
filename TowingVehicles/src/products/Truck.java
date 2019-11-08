package products;

import java.text.SimpleDateFormat;
import java.util.Random;

import options.ClimateControl;
import options.Towing;
import transport.Vehicle;

public class Truck extends Vehicle implements Towing, ClimateControl
{
	private String vin;
	
	public Truck(int aNumberOfWheels)
	{
		super(aNumberOfWheels);
		this.serialNumber = "TRUCK-" + vehicleCounter;
		vin = serialNumber;
	}
	
	// getters
	public String getVin()
	{
		return vin;
	}

	@Override
	public void cool() 
	{
		System.out.println("Car is cooling");
		
	}

	@Override
	public void heat() 
	{
		System.out.println("Car is heating");
		
	}

	@Override
	public void currentTemperature() 
	{
		int minimum = 33;
		int maximum = 100;
		Random rand = new Random();
		int currentTemp = minimum + rand.nextInt(maximum - minimum + 1);
		
		System.out.println("Car current temperature is: " + currentTemp);
		
	}

	@Override
	public void towing(Vehicle vehicleBeingTowed) 
	{
		if(canTow(vehicleBeingTowed))
		{
			System.out.println("Truck can tow this vehicle");
		}
		else
			System.out.println("Truck cannot tow this vehicle");
	}

	@Override
	public void towCapacity() 
	{
		double towCapacity = this.weight * 0.9;
		System.out.printf("towCapacity: %41s\n", towCapacity);
	}

	@Override
	public boolean canTow(Vehicle vehicle) 
	{
		double towCapacity = this.weight * 0.9;
		if(towCapacity > vehicle.getWeight()) 
		{
			return true;
		}
		else
			return false;
	}

	@Override
	public void move() 
	{
		System.out.println("The car is moving");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("The car is stopping");
		
	}
	
	@Override
	public void specs() 
	{
		String datePattern = "dd-MM-yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattern);
		
		System.out.println("========================================");
		System.out.println(this.getClass().getSimpleName());
		System.out.println("========================================");
		
		System.out.printf("Vin: %35s\n", serialNumber);
		System.out.printf("dateBuild: %29s\n", simpleDateFormat.format(dateBuild));
		System.out.printf("numberOfWheels: %24s\n", numberOfWheels);
		System.out.printf("weight: %32s\n", weight);
	}
}
