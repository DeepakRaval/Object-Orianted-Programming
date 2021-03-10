package abstraction.ExamplesOfLoseCoupling;

public class Car implements Vehicle {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving in CAR");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("with Speed limit of CAR is 100 kh/hr");
	}
}
