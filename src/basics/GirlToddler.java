package basics;


// one  class can implement multiple interface
public class GirlToddler implements Toddler {
	
	// to print the method messages , create an object for class and access the methods via it 
	public static void main(String[] args)
	{
		Toddler kid = new GirlToddler();

		
		kid.Eat();
	
		
		kid.Sleep();
	
		
		kid.Play();
		
	}

	

	@Override
	public void Eat() {
		System.out.println("GirlToddler eats small frequent meals");
		
	}

	@Override
	public void Sleep() {
		System.out.println("GirlToddler sleeps for atleast 13hrs");
		
	}

	@Override
	public void Play() {
		System.out.println("GirlToddler plays");
		
	}
	
	

}
