import java.util.Scanner;
class Solution5 { 

	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the any floting number");
		float x =sc.nextFloat(); 
		sc.close();
        int count=0;
        do
    	{
    	    x =x*10;
    		count++ ;
    	} 
    while(x != (int)x);
	System.out.println("digit after decimal is:"+count);
	} 
}
