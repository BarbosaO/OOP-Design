package products;

import java.text.SimpleDateFormat;
import java.util.Random;

import options.ClimateControl;
import transport.Vehicle;

public class Car extends Vehicle implements ClimateControl
{
	private int numberOfPassengers;
	private String vin;
	
	public Car(int aNumberOfWheels, int aNumberOfPassengers)
	{
		super(aNumberOfWheels);
		this.serialNumber = "CAR-" + vehicleCounter;
		this.numberOfPassengers = aNumberOfPassengers;
		vin = serialNumber;
	}
	
	public Car(int aNumberOfWheels)
	{
		super(aNumberOfWheels);
		this.serialNumber = "CAR-" + vehicleCounter;
		vin = serialNumber;
	}
	
	
	// Getters
	public String getVin()
	{
		return vin;
	}
	
	public int getNumberOfPassengers()
	{
		return numberOfPassengers;
	}
	
	// Setters
	public void setNumberOfPassengers(int newNumberOfPassengers)
	{
		numberOfPassengers = newNumberOfPassengers;
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
		System.out.printf("numberOfPassengers: %20s\n", numberOfPassengers);
		System.out.printf("weight: %32s\n\n", weight);
	}

}
