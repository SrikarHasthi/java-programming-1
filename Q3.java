import java.util.ArrayList;  
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream; 
class Employe{
	int empId, empSalary ;
	String empName,empDesignation,empLocation;
	public Employe(int empId,int empSalary,String empName,String empDes,String empLoc) {
		this.empId=empId;
		this.empSalary=empSalary;
		this.empName=empName;
		this.empDesignation=empDes;
		this.empLocation=empLoc;
	}
	
}
public class Q3{
	public static void main(String[] args) {
		List<Employe> l=new ArrayList<Employe>();
		l.add(new Employe(1001, 40000,"rahul","Project manager","Agra"));
		l.add(new Employe(1002, 70000,"amit","salesman","Mumbai"));
		l.add(new Employe(1003, 50000,"piyush","analyst","Punjab"));
		l.add(new Employe(1004, 90000,"hemanth","Program manager","Andhra"));
		l.add(new Employe(1005, 100000,"raju","Vice president","Telangana"));
		l.add(new Employe(1006, 30000,"aman","Trainee","Madhya Pradesh"));
		l.add(new Employe(1007, 10000,"surya","Senior Trainee","Kerala"));
		l.add(new Employe(1008, 200000,"srikar","CEO","Mysore"));
		l.add(new Employe(1009, 80000,"rohit","Director","Delhi"));
		l.add(new Employe(1010, 55000,"suresh","Project Lead","Haryana"));
		
		List<String> s=l.stream().map(n->n.empName).collect(Collectors.toList());
		System.out.println(s);
		System.out.println(" ");
		l.stream().filter(n->n.empSalary > 50000).forEach(c->System.out.println(c.empSalary));;
		System.out.println(" ");
		l.stream().filter(n->n.empLocation.charAt(0)=='M').forEach(c->System.out.println(c.empLocation));;
		System.out.println(" ");
		l.stream().filter(n->n.empDesignation.endsWith("e")).forEach(c->System.out.println(c.empDesignation));;
	}
}
