//package Imp;

import java.util.Arrays;
import java.util.Scanner;

class Product
{
	static int a[] = new int[5];
	// static int a[] = new int[5];
	static int i=0;
	int pid;
	int price;
	int quantity;
	static int amt;
	Product(int pid , int price , int quantity)
	{
		this.pid = pid;
		this.price =price;
		this.quantity = quantity;
	}
	
	public void show()
	{
		System.out.println("Pid :"+this.pid+"  Price  :"+this.price+"  Quantity  :"+this.quantity);
	}
	
	static void amount(int price ,int quantity)
	{
		a[i]=price *quantity;
		i++;
		//System.out.println("Total amount : "+amt);
	}
	
}

class Solution6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
		int arrPrice[] = new int[5];
		int pid , price ,quantity ;
		for(int i = 0 ;i<arr.length ; i++)
		{
			System.out.println("Enter a pid of product");
			pid = sc.nextInt();
			System.out.println("Enter a price of product");
			price =sc.nextInt();
			System.out.println("Enter a quantity of product");
			quantity = sc.nextInt();
			
			Product p =new Product(pid,price,quantity);
			arr[i] = p;
			arrPrice[i] = arr[i].price;
			Product.amount(arr[i].price , arr[i].quantity);
		}
		int highestPrice = Arrays.stream(arrPrice).max().getAsInt();
		
		System.out.println("Highest price is "+highestPrice);
		for(int k = 0; k<arrPrice.length ; k++) {
			if(arrPrice[k]==highestPrice) {
				System.out.println("Pid of highest Price is :+arr[k].pid ");
			}
		}
		for(Product j : arr ) j.show();
		
		for (int l = 0 ; l<5 ; l++ )
			System.out.println("Total amount of "+l+" :  "+Product.a[l]);
		
	}
}