import java.util.Scanner;

public class Biggest {
	int x,y,z;
	Scanner s=new Scanner(System.in);
	public void three() {
		
	
	System.out.println("Enter first number:");
	x=s.nextInt();
	System.out.println("Enter second number:");
	y=s.nextInt();
	System.out.println("Enter third number:");
	z=s.nextInt();
	
	if(x>y && x>z)
	{
		System.out.print("Largest number is:"+x);
	}
	else if(y>z)
	{
		System.out.print("Largest number is:"+y);

	}
	else
	{
		System.out.print("Largest number is:"+z);
	}
	
	}

}
