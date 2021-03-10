package abstraction.ExamplesOfLoseCoupling;

public class TestLoseCoupling {
	
	public static void main (String[]args){
		Traveller t = new Traveller();
		t.v = new Car();
		t.setV(t.v);
		t.v.move();
		
		// by passing values method
		t.speedLimit(new Car());
	}

}
