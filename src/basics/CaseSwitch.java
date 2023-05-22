package basics;
import java.util.Scanner; 

public class CaseSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your child's age: ");
		
		int age = scanner.nextInt();
		System.out.println("Your child is " +age + " years old.");
		
		
		switch(age)
		{
		case 1: 
			if(age < 1)
			{
				System.out.println("Your child is an infant");
			}
			break;
		case 2: 
			if(age >=1 && age <=3)
			{
				System.out.println("Your child is an toddler");
			}
			break;
			
		case 3: 
			if(age >3 && age <=5)
			{
				System.out.println("Your child is an preschooler");
			}
			break;
		
		case 4: 
			if(age >5  && age <=12)
			{
				System.out.println("Your child is an gradeschooler");
			}
			break;
			
		case 5: 
			if(age >12 && age <=18)
			{
				System.out.println("Your child is a teen");
			}
			break;
			
		default: 
			System.out.println("Please enter a age between 0 to 18");
			
		}
	}

}
