package Demo;

public class exceptionThrow {
	public static void main(String[] args) {
		demo();
	}
	public static void demo() {
		System.out.println("Ola");
		throw new ArithmeticException("not valid operation");
		//int i =1/0;
		//System.out.println("Done");
	} 
}
