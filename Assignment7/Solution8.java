class Faculty{
	int facultyId ;
	int salary ;
	
	public void input(int facultyId) {
		this.facultyId = facultyId;
	}
	public void printSalary() {
		System.out.println("Salary  : "+salary);
	}
}
class FullTimeFaculty extends Faculty{
	int basicSalary ; 
	int allowance ;
	
	public void input(int facultyId , int basicSalary , int allowance) {
		super.input(facultyId);
		this.basicSalary =basicSalary ;
		this.allowance = allowance ;
		this.salary = basicSalary + allowance ;
	}	
}
class PartTimeFaculty extends Faculty {
	int workingHours ;
	int ratePerHour ;
	public void input(int facultyId , int workingHours , int ratePerHour) {
	super.input(facultyId);
	this.workingHours = workingHours ;
	this.ratePerHour = workingHours ;
	this.salary = workingHours * ratePerHour ;
	}
}
public class Solution8 {
	public static void main(String[] args) {
		FullTimeFaculty f1 = new FullTimeFaculty();
		f1.input(1,10000,2000);
		f1.printSalary();
		
		PartTimeFaculty p = new PartTimeFaculty();
		p.input(2, 100, 100);
		p.printSalary();
	}

}