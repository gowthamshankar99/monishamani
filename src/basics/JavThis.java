package basics;

public class JavThis {
	
	int a = 2;

	public void getData()
	{
		int a = 3;
		System.out.println(a); // prints the local var a = 3
		System.out.println(this.a);  // prints class variable a = 2
		
		int c = a + this.a;
		System.out.println(c);
		// this keyword refers to current object - object scope lies in class level
		
	}
	
	
	public static void main(String[] args) {
	
		JavThis jt = new JavThis();
		jt.getData();
		

	}

}
