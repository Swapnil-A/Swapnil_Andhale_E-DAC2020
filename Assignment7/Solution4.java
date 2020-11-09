import java.util.Scanner;
class Math_Operation1{
	
	void multiply(int a,int b)
	{
		int result=0;
		System.out.println("Case1 Result : "+(result=a*b));
	}
	void multiply(float a,float b,float c)
	{
		float result=0;
		System.out.println("Case2 Result : "+(result=a*b*c));
		
		
	}void multiply(int arr[])
	{
		int result=1;
		for(int i=0;i<arr.length;i++)
		{
			result=result*arr[i];
		}
		System.out.println("Case3 Result : "+result);
		
		
	}void multiply(double a,int b)
	{
		double result=0;
		System.out.println("Case4 Result : "+(result=a*b));
	}
}
public class Solution4 {

	public static void main(String[] args) {
		Math_Operation1 m=new Math_Operation1();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the  two integer value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		m.multiply(a, b);
		
		System.out.println("Enter the three float value");
		float a1=sc.nextFloat();
		float b1=sc.nextFloat();
		float c1=sc.nextFloat();
		m.multiply(a1, b1, c1);

		System.out.println("Arrays value taken as hardcoded...");
		System.out.println("Multiplication of array element is as follow : ");
		int arr[]={3,5,4,7,8,9};
		m.multiply(arr);
		
		System.out.println("Enter the first double and then second integer value");
		double a2=sc.nextDouble();
		int b2=sc.nextInt();
		m.multiply(a2, b2);
		
		sc.close();
}
}
