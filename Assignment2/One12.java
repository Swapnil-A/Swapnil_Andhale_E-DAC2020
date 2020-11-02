package Assignment1;
import java.util.Scanner;
public class One12 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float basic_salary, gross_salary, da, hra;
		System.out.println("Enter Basic Salary Of Employee = ");
		basic_salary=sc.nextFloat();

		if (basic_salary<1500)
		{
			hra=basic_salary*10/100;
			da=basic_salary*90/100;
		}
		else
		{
			hra=500;
			da=(basic_salary*98/100);
		}

		gross_salary=basic_salary + hra + da;

		System.out.println("Gross Salary Of Employee Is = "+gross_salary+" Rupyees.");
		sc.close();		
	}

}
