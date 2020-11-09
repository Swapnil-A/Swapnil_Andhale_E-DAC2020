
import java.util.Scanner;

abstract class Processor {
	int data ;
	Scanner sc = new Scanner(System.in);
	abstract void process() ;
	void showData(int data) {
		System.out.println("Data value : "+data);
	}
}
class Factorial extends Processor {
	void process() {
		System.out.println("Enter the number  : ");
		//Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		int sum = 1 ;
		for(int i = 1 ; i<= data ;i++) {
			sum = sum * i ;
		}
		System.out.println("Factorial is : "+sum);
		showData(sum);
	}
}
class Circle extends Processor{
	void process(){
		float radius ;
		System.out.println("Enter a radius :");
		radius = sc.nextFloat();
		float area = (float)(Math.PI * Math.pow(radius, 2));
		System.out.println("Area of circle = "+area);
	}
}
public class Solution9 {
	static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Factorial");
		System.out.println("2.Circle");		
		System.out.println("Enter choice : ");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice ;
		while((choice = menuList())!=0)  {
			switch(choice) {
		case 1:
			Processor p = new Factorial();
			p.process();
			break;
		case 2:
			Processor p1 = new Circle ();
			p1.process();
			break ;
		default :
			System.out.println("Entered wrong choice !!");
		}
	}
}
}