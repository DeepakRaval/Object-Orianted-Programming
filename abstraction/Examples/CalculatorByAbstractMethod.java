package abstraction.Examples;

/*
 * Abstract class
 * Abstract class is combination of concrete methods and abstract method it may have only one from it
 * it is used by extends key word  */
public abstract class CalculatorByAbstractMethod {
	
	public abstract void addition(int a,int b);
	public static void substraction(){
		int a=5,b=3,c;
		c = a - b;
		System.out.println("Substraction= "+c);
	}
	
	public abstract void multiplication();

}
