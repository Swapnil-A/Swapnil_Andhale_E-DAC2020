package Assignment1;
import java.util.Scanner;
public class One8 
{
	public static void main (String args[])
	{
	double p,n,r,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter principal amount: ");
	p=sc.nextDouble();

	System.out.println("Enter time ");
	n=sc.nextDouble();

	System.out.println("Enter rate of intrest ");
	r=sc.nextDouble();
	sc.close();

	i=(p*n*r)/100 ;

	System.out.println("Simple Intrest ="+i);

	}

}
