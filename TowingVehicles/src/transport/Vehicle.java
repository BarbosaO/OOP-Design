package transport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public abstract class Vehicle 
{
	public abstract void move();
	public abstract void stop();
	
	protected int numberOfWheels;
	protected static int vehicleCounter = 1000;
	protected Date dateBuild;
	protected String serialNumber;
	protected int weight;
	
	private final int MIN_WEIGHT = 2501;
	private final int MAX_WEIGHT = 4500;
	
	public Vehicle()
	{
		Random rndGen = new Random();
		vehicleCounter++;
		this.serialNumber = "VEHICLE-" + vehicleCounter;
		this.dateBuild = new Date();
		this.numberOfWheels = 0;
		weight = MIN_WEIGHT + rndGen.nextInt(MAX_WEIGHT - MIN_WEIGHT + 1);
	}
	
	public Vehicle(int aNumberOfWheels)
	{
		numberOfWheels = aNumberOfWheels;
		Random rndGen = new Random();
		vehicleCounter++;
		serialNumber = "VEHICLE-" + vehicleCounter;
		dateBuild = new Date();
		weight = MIN_WEIGHT + rndGen.nextInt(MAX_WEIGHT - MIN_WEIGHT + 1);
	}
	
	// Getters
	public int getVehicleCounter()
	{
		return vehicleCounter;
	}
	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	// Setters
	public void setSerialNumber(String newSerialNumber)
	{
		serialNumber = newSerialNumber;
	}
	
	public void setNumberOfWheels(int newNumberOfWheels)
	{
		numberOfWheels = newNumberOfWheels;
	}
	
	public void setVehicleCounter(int newVehicleCounter)
	{
		vehicleCounter = newVehicleCounter;
	}
	
	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}
	
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
		System.out.printf("weight: %32s\n\n", weight);
	}
}
