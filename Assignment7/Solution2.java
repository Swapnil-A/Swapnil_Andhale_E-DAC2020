import java.util.Scanner;
class Circle{
	float radius;
	double area;
	
	void init(float radius)
	{
		this.radius=radius;
	}
	
	void calculate_Area() 
	{
		this.area=(3.14*radius*radius);
	}
	void show()
	{
		System.out.println("Given Radius is                              : "+radius);
		System.out.println("Calculated Area of Circle for given Radius is: "+area);
		
	}
}
public class Solution2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value for Radius                       : ");
		float r=sc.nextFloat();
		Circle c=new Circle();
		c.init(r);
		c.calculate_Area();
		c.show();
		sc.close();
		
	}

}
