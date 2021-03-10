package abstraction.Examples;

//testing example of calculator
public class TestCalculator implements Calculator {
	
	
	public static void main(String[]arg){
		TestCalculator t = new TestCalculator();
		t.addition(5, 2);
		t.substraction(5, 2);
		t.multiplication(5, 2);
	}
	
	

	@Override
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition= "+c);
	}

	@Override
	public void substraction(int a, int b) {
		int c = a-b;
		System.out.println("Substraction= "+c);		
	}

	@Override
	public void multiplication(int a, int b) {
		int c = a*b;
		System.out.println("Multiplication= "+c);
	}

}
