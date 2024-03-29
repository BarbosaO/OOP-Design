package app;

import options.ClimateControl;
import options.Towing;
import products.Car;
import products.Truck;
import transport.Vehicle;

public class Controller 
{
	 public static void main(String[] args) 
	 {

		 Vehicle car1 = new Car(4,6);
		 Car car2 = new Car(4,2);
	
		 Truck truck1 = new Truck(6);
	
		 processVehicle(car1);
		 processVehicle(car2);
		 processVehicle(truck1);
	
		 hasClimateControl(car2);
		 hasClimateControl(truck1);
	
		 hasTowing(truck1, car2);

	 }//end main()

	 //---------------------------------------------------------------------------

	 public static void processVehicle(Vehicle vehicle)
	 {
		 vehicle.specs();
	 }

	 //---------------------------------------------------------------------------

	 public static void hasClimateControl(ClimateControl vehicle)
	 {
		 System.out.println("");
		 System.out.println("=========================================");
		 System.out.println("hasClimateControl(ClimateControl vehicle)");

		 if(vehicle instanceof Car)
		 {
			 System.out.println( ((Car)vehicle).getVin());
		 }
		 else
		 {
			 System.out.println( ((Truck)vehicle).getVin());
		 }

		 System.out.println("=========================================");

		 vehicle.cool();
		 vehicle.heat();
		 vehicle.currentTemperature();

	 }//end hasClimateControl()

	 //---------------------------------------------------------------------------

	 public static void hasTowing(Towing towVehicle, Vehicle vehicleToBeTowed)
	 {
		 System.out.println("");
		 System.out.println("======================================================");
		 System.out.println("hasTowing(Towing towVehicle, Vehicle vehicleToBeTowed)");
		
		 if(towVehicle instanceof Car)
		 {
			 System.out.println(((Car)towVehicle).getVin());
		 }
		 else
		 {
			 System.out.println(((Truck)towVehicle).getVin());
		 }
		
		 System.out.println("======================================================");
		
		 towVehicle.canTow(vehicleToBeTowed);
		
		 towVehicle.towCapacity();
		 System.out.printf("vehicleToBeTowed weight: %29s\n", vehicleToBeTowed.getWeight());
		 towVehicle.towing(vehicleToBeTowed);

	 }//end hasTowing
}
