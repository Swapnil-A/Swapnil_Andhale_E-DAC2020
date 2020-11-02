package Assignment1;
import java.util.Scanner;
public class One6 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	double r =sc.nextDouble();
	sc.close();
	System.out.println("Radius ="+r);
	double area = 3.14*(r*r);
	System.out.println("Area of circle ="+area);
	double circumferance = 3.14* 2*r;
	System.out.println("Circumferance of circle ="+circumferance);
	}

}
