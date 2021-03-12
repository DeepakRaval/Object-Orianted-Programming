package encapsulation.Example;
/**
 * Encapsulation - wrapping of data of code in single unit 
 * 
 *  here variable a and b is hidden from outer world 
 *  but there is provision of accessing these variables 
 *  by getters and setters methods
 * 
 * **/
public class ExampleOfEncapsulation {
	
	private int a;
	private String b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	

}
