import java.lang.Math;
class triangle{
	double a,b,c;
	double area(double a,double b,double c) {
		double s=(a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
}
public class Q7 {
	public static void main(String[] args) {
		triangle t=new triangle();
		System.out.println(t.area(10,5,7));
	}
}
