class circle{
	private
		double radius=1.0;
		String color="red";
	public circle() {
		
	}
	public circle(double radius) {
		
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*2*3.14;
	}
}
public class Q4 {
	public static void main(String[] args) {
		circle c=new circle();
		System.out.println("radius = "+c.getRadius());
		System.out.println("area = "+c.getArea());
	}
}
