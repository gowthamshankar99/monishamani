package basics;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		while(a<=15)
		{
		
			System.out.println(a);
			a++;
		}
		
		
		int b = 11;
		do
		{
		System.out.println("This statement executes atleast  once  even if the while condition is not true ");
		b++;
		} while(b<=10);

	}

}
// do while used when the numnber of execution is unknown  - like copying contents of file 
// for - know number of executions 