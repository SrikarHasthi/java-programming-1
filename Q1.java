interface cal{
	int method(int a,int b);
}
public class Q1 {
	public static void main(String[] args) {
		cal c1=(int a, int b)->{
			return (a+b);
		};
		System.out.println(c1.method(30,10));
		cal c2=(a,b)->(a-b);
		System.out.println(c2.method(30,10));
		cal c3=(a,b)->(a*b);
		System.out.println(c3.method(30,10));
		cal c4=(a,b)->(a/b);
		System.out.println(c4.method(30,10));	
	}
}
