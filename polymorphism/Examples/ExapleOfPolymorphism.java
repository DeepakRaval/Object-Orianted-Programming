package polymorphism.Examples;

public class ExapleOfPolymorphism {

	public static void main(String[] args) {
		ExapleOfPolymorphism ep = new ExapleOfPolymorphism();
		ep.addition(10l ,10);
	}
	// same name with one argument
	public void addition(int a){
		System.out.println("in fist "+ (a + 10));
	}
	// same name with diff no. of arguments
	public void addition(int a, int b){
		System.out.println("in second "+ (a + b));
	}
	// same name with same no. of arguments BUT diff types
	public void addition(int a, long b){
		System.out.println("in third "+ (a + b));
	}
	// same name with same no. of arguments with same type BUT diff sequence
	public void addition( long b, int a){
		System.out.println("in fourth "+(a + b));
	}
	// same name with diff no. of arguments
	public void addition(int a, float b, int c){
		System.out.println("in five "+(a + b));
	}

}
