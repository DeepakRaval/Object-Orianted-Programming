package inheritance.Examples;

public class MainClassForAbstractMethod extends AbstractMethod {


	public static void main(String[]args){
		MainClassForAbstractMethod m = new MainClassForAbstractMethod();
		m.amOne();
		MainClassForAbstractMethod.amSecond();
	}
	@Override
	public void amOne() {
		// TODO Auto-generated method stub
		System.out.println("inside main class extended from abstract method");
		
	}
}
