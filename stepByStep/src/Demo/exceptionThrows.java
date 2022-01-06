package Demo;

public class exceptionThrows {
	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo() throws Exception {
		System.out.println("Ola");
		
		int i =1/0;
		System.out.println("Done");
	}
}
