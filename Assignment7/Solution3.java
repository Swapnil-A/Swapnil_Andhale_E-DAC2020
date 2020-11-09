import java.util.Scanner;
class Math_Operation{
	int num1;
	int num2;
	
	int add(int num1,int num2)
	{
		int result1;
		this.num1=num1;
		this.num2=num2;
		return (result1=num1+num2);
		
	}
	int sub(int num1, int num2)
	{
		int result2;
		this.num1=num1;
		this.num2=num2;
		return (result2=num1-num2);
		
	}
	int mul(int num1,int num2)
	{
		int result3;
		this.num1=num1;
		this.num2=num2;
		return (result3=num1*num2);
		
	}
	int div(int num1,int num2)
	{
		int result4;
		this.num1=num1;
		this.num2=num2;
		return (result4=num1+num2);
		
	}
}
public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		Math_Operation m=new Math_Operation();
		int result1=m.add(num1, num2);
		int result2=m.sub(num1, num2);
		int result3=m.mul(num1, num2);
		int result4=m.div(num1, num2);
		
		System.out.println("Addition of numbers is        = "+result1);
		System.out.println("Substraction of numbers is    = "+result2);
		System.out.println("Multiplication of numbers is  = "+result3);
		System.out.println("Division of numbers is        = "+result4);
		sc.close();
	}

}
