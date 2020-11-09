import java.util.Scanner;
class Student 
{
	private int rollno ;
	private String name;
	
	public void setData(int rollno , String name) {
		this.rollno = rollno;		
		this.name = name ;
	}
	public void showData(){
		System.out.println("Roll no : "+this.rollno+"   Name  :"+this.name);
	}
}
public class Solution1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.setData(119,"Sandeep");
		s.showData();
	}

}
