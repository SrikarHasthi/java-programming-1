import java.util.ArrayList;
class Employee{
	String name,address;
	int salary,year;
	 public Employee(String name,int year,String address,int salary){
		this.name=name;
		this.year=year;
		this.address=address;
		this.salary=salary;
	}
	public String toString(){
		return this.name+"\t\t"+this.year+"\t"+this.address;
	}
}
public class Q6 {
	public static void main(String[] args) {
	ArrayList<Employee> list=new ArrayList<Employee>();
	list.add(new Employee("Robert",1994,"64C- WallStreet",50000));
	list.add(new Employee("Sam",2000,"68D- WallStreet",35000));
	list.add(new Employee("John",1999,"26B- WallStreet",70000));
	System.out.println("Name"+"   "+"Year of joining"+"  "+"Address");
	list.forEach(n->System.out.println(n));;
	}
}
