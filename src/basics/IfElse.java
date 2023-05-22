package basics;
import java.util.Scanner; 

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<=10; i++)
		{
			System.out.println("Enter the number  ");
			num = scanner.nextInt();
			if( num%2 == 0)
			{
				System.out.println("Its an even number");
			}
			else
				System.out.println("Its an odd number");
		}
		



	}

}
