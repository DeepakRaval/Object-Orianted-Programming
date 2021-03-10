package abstraction.ExamplesOfLoseCoupling;

public class Traveller {
	
	 Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void stratJourney(){
		Traveller t = new Traveller();
		t.v.move();
	}
	// by another method or by passing values to method
	public void speedLimit(Vehicle v){
		v.speed();
	}

}
