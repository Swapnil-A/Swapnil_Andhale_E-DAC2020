import java.util.Scanner;
class Solution3{ 

public static void Sequence(int N) 
{ 
	for(int i=1;i<=N;i++)
		 
	if (i % 2 == 0) 
		System.out.print(Integer.toString(i*i)+" "); 
	else
		System.out.print(Integer.toString(i*i*i)+" ");
	
} 
 
public static void main(String args[]) 
{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number where upto you want series");
	int N =sc.nextInt(); 
	sc.close();
	System.out.println("Your series:");
	Sequence(N); 
} 
} 

