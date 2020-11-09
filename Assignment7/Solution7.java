class OneBHK{
	int roomArea;
	int hallArea;
	int price;
	
	public OneBHK() {
		roomArea =10;
		hallArea = 100;
		price = 100000;
	}
	public OneBHK(int roomArea , int hallArea ,int price  )
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price  = price ;
	}
	public void show() {
		System.out.println("Room Area    :  "+this.roomArea);
		System.out.println("Room Area    :  "+this.hallArea);
		System.out.println("Room Area    :  "+this.price);
	}
}
class TwoBHK extends OneBHK
{
	int room2Area;
	public TwoBHK(){
		roomArea = 20 ;
		hallArea =200 ;
		price =200000 ;
	}
	
	public TwoBHK(int roomArea , int hallArea ,int price , int room2Area   )
	{
		super(roomArea , hallArea , price);
		this.room2Area = room2Area;
	}
	public void show(){
		super.show();
		System.out.println("Room 2 Area  :  "+this.room2Area);
		System.out.println();
	}
	
	
}

public class Solution7 {
	public static void main(String[] args) {
		TwoBHK t1 = new TwoBHK(100,100,100000,100);
		TwoBHK t2 = new TwoBHK(200,200,200000,200);
		TwoBHK t3 = new TwoBHK(300,300,300000,300);
		TwoBHK arr[ ] = { t1 , t2 , t3 };
		for(TwoBHK i : arr ) i.show();
	}

}