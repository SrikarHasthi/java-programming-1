import java.util.Scanner;
class Rectangle{
	int width,height;
	void display() {
		System.out.println(width+" "+height);
	}
}
class RectangleArea extends Rectangle {
	void read_input() {
		Scanner sc=new Scanner(System.in);
		this.width=sc.nextInt();
		this.height=sc.nextInt();
	}
	void display(int a) {
		System.out.println(width*height);
	}
}

public class Q2 {
 public static void main(String[] args) {
	 int a=0;
	RectangleArea ra=new RectangleArea();
	ra.read_input();
	ra.display();
	ra.display(a);
}
}
