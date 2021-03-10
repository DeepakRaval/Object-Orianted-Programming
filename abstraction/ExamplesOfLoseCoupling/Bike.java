package abstraction.ExamplesOfLoseCoupling;

public class Bike implements Vehicle {

	@Override
	public void move() {
		System.out.println("Moving by Bike");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("with Speed limit of BIKE is 80 km/hr");
	}
	
	

}
