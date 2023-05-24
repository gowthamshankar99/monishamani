package basics;

public class JavConstructor {

	/// default constructor  - no return type 
	public JavConstructor()
	{
		// automaticallly executed when object is created without ahve to call the constructor method explicitly 
		System.out.println("Inside constructor");
	}
	
	// Parameterized constructor
	
	public JavConstructor(int a, int b)
	{
		
		System.out.println(a);
		System.out.println(b);
		int c = a+b;
		System.out.println(c);
	}
	
	
	public JavConstructor(String str)
	{
	
		System.out.println(str);
	
	}
	
	// normal method 
	
	public void random()
	{
		System.out.println("inside random method");
	}
	
	public static void main(String[] args) {
		// block of code under the constructor is executed evrytime an object is created
		// construtor will not return values and same as teh classname 
	    // if you dont explicitly create a constructor compiler will call a defaul/implicit available in java library constructor
	// you can declare common variables and methods insdie the condtructor for all the objects to use while defining 
	
	
		// create an object of JavConstructor class
		JavConstructor jc = new JavConstructor();
		
		JavConstructor JC = new JavConstructor();
		
		
		// calling parameterized constructor
		
		JavConstructor pc = new JavConstructor(2,4);
		JavConstructor PC = new JavConstructor("Thea");
	}
	

}
