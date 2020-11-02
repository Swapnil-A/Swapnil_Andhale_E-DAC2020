package Assignment1;
import java.util.*;
public class One10 
{
	public static void main(String args[])
	{
	Scanner sc =new Scanner(System.in);
	int f=sc.nextInt();
	System.out.println("Enter Fahrenheit ");
	double c;
	c=5*(f-32)/9;
	sc.close();
	System.out.println("Celsius = "+c);
	}

}
