package Demo;

public class exceptionHandling {
	public static void main(String[] args) {
		try {
			System.out.println("Ola");
			
			int i =1/0;
			System.out.println("Done");
		}
		catch (Exception exp){
			System.out.println("Catch initiated");
			System.out.println("Message is:  " + exp.getMessage());
			System.out.println("Cause is: " + exp.getCause());
			exp.printStackTrace();
			
		}
		finally {
			System.out.println("I am in finally !!!");
		}
		}
	

}
