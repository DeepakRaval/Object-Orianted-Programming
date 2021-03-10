package abstraction.Examples;

public class TestCalculatorByAbstractMethod extends CalculatorByAbstractMethod {
	
	public static void main(String[]arg){
		TestCalculatorByAbstractMethod tc = new TestCalculatorByAbstractMethod();
		tc.addition(5, 3);
		TestCalculatorByAbstractMethod.substraction();
		tc.multiplication();
	}

	@Override
	public void addition(int a, int b) {
		int c = a+b;
		System.out.println("Addition= "+c);
	}

	@Override
	public void multiplication() {
		int a=5,b=3,c;
		c = a*b;
		System.out.println("Multiplication= "+c);
	}

}
