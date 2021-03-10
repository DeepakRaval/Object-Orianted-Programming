package inheritance.Examples;

public class MainClassForInterface implements InheritanceOne {

	
	public static void main (String[]args){
		MainClassForInterface m = new MainClassForInterface();
		m.methodOne();
		m.methodSecond();
	}
	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("inside method one");
	}

	@Override
	public void methodSecond() {
		// TODO Auto-generated method stub
		System.out.println("inside method second");
	}

}
