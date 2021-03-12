package encapsulation.Example;

public class TestingEncapsulation {
	public static void main (String [] args){
		ExampleOfEncapsulation e1 = new ExampleOfEncapsulation();
		e1.setA(5);
		e1.setB("Ram");
		System.out.println(e1.getA() +" "+ e1.getB());
		
	}
}
