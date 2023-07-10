package vehicle_classifier;
class Vehicle
{
	String vehicle="vehicle";
	public void start()
	{
		System.out.println(vehicle+" started");
	}
	public void stop()
	{
		System.out.println(vehicle+" stopped");
	}
	
}
class Car extends Vehicle
{
	public Car (String vehicle)
	{
		super.vehicle=vehicle;
	}
}
class Motorcycle extends Vehicle
{
	public Motorcycle(String vehicle) {
		super.vehicle=vehicle;
	}
}
public class Vehicle_classifier {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		//  Creating instance for each classes with vehicle name passed through the constructor
		Motorcycle motorcycle=new Motorcycle("Motorcycle");
		Car car=new Car("car");
		Vehicle vehicle=new Vehicle();
		
		
		// calling vehicle instance
		vehicle.start();
		vehicle.stop();
		
		//calling car instance
		car.start();
		car.stop();
		
		//calling motorcycle instance
		motorcycle.start();
		motorcycle.stop();

	}

}
