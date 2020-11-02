package Assignment1;
import java.util.*;
public class One11 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		sc.close();
		System.out.println("x ="+x+" y="+y);
	}

}
