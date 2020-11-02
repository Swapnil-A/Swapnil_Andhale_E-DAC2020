package Assignment1;
import java.util.Scanner;
public class One7 
{
	public static void main (String[] args)
	{
	int total=0,percentage;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Subject :");
	int a =sc.nextInt();
	int marks[] =new int[a];
	sc.close();
	System.out.println("Enter the marks out of 100 :");
	for(int i=0;i<a;i++)
	{
	marks[i]=sc.nextInt();
	total = total + marks[i];
	}
	percentage=total / a;
	System.out.println("Total marks = "+total);
	System.out.println("Percentage = "+percentage+"%");
	
	
	}

}
