package inheritance.Examples;

public class MainMethodForAll extends AbstractMethod implements InheritanceOne,InterfaceSecond{
	
	
	public static void main (String[]args){
		MainMethodForAll m = new MainMethodForAll();
		m.amOne();
		MainMethodForAll.amSecond();
		m.methodSecond();
		m.mIOne();
		m.methodOne();
		
	}

	@Override
	public void mIOne() {
		// TODO Auto-generated method stub
		System.out.println("from second interface ");
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("from inhertance one");
		
	}

	@Override
	public void methodSecond() {
		// TODO Auto-generated method stub
		System.out.println("from interface one");
	}

	@Override
	public void amOne() {
		// TODO Auto-generated method stub
		System.out.println("from abstract method one");
	}

}
