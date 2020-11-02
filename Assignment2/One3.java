package Assignment1;

public class One3 
{
	public static void main(String args[])
	{
	int x=2 ,z ,y ,a;
	boolean b ,c=true,d=false;
	y = x^2+3*x-7 ;
	System.out.println(y);
	a = x++ + ++x;
	System.out.println(a);
	z = x++ - --y - --x  +  x++ ;
	System.out.println(z);
	b = c && d || !(c || d);
	System.out.println(b);
	}
}
