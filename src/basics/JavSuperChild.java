package basics;

public class JavSuperChild extends JavSuperParent {
	
	// Suoer keyword is used to refer ti the variable in parent class
	
	String name = "Thea";
	
	public void getString()
	{
		System.out.println(name); // display local String variable - Thea
		System.out.println(super.name); // display Parent String variable - Monisha
	}
	

	public static void main(String[] args) {
		
	JavSuperChild c = new JavSuperChild();
	c.getString();
		
		

	}

}
