import java.lang.Math;
class Complex {  
	double real, imaginary;  
	Complex(){
		
	}
	Complex(int tempReal, int tempImaginary) 
	{ 
		real = tempReal; 
		imaginary = tempImaginary; 
	}  
	Complex addition(Complex C1, Complex C2) 
	{ 
		Complex temp = new Complex(); 
		temp.real = C1.real + C2.real; 
		temp.imaginary = C1.imaginary + C2.imaginary; 
		return temp; 
	} 
	Complex subtraction(Complex C1, Complex C2){
		Complex temp = new Complex();
        temp.real = C1.real - C2.real;
        temp.imaginary = C1.imaginary - C2.imaginary;
        return temp;
     }
	 Complex multiplication(Complex C1, Complex C2){
		 Complex temp = new Complex();
	     temp.real = ( C1.real * C2.real ) - ( C1.imaginary * C2.imaginary);
	     temp.imaginary = ( C1.real * C2.imaginary ) + ( C1.imaginary * C2.real);
	     return temp;
	 }
	 Complex division(Complex C1, Complex C2){
	     Complex temp = new Complex();
	     temp.real = ((( C1.real * C2.real ) + ( C1.imaginary * C2.imaginary)) / (Math.pow(C2.real, 2) + Math.pow(C2.imaginary, 2)));
	     temp.imaginary =((( C1.real * C2.imaginary ) - ( C1.imaginary * C2.real )) / (Math.pow(C2.real, 2) + Math.pow(C2.imaginary, 2)));
	     return temp;
	    }
} 

public class Q5{  
	public static void main(String[] args) 
	{ 
		Complex C1 = new Complex(3, 2); 
		Complex C2 = new Complex(9, 5); 
		Complex C3 = new Complex(); 
		C3 = C3.addition(C1, C2); 
		System.out.println("Sum of complex number : "+ C3.real + " + i"+ C3.imaginary); 
		C3 = C3.subtraction(C1, C2); 
		System.out.println("Difference of complex number : "+ C3.real + " + i"+ C3.imaginary); 
		C3 = C3.multiplication(C1, C2); 
		System.out.println("Multiplication of complex number : "+ C3.real + " + i"+ C3.imaginary); 
		C3 = C3.division(C1, C2); 
		System.out.println("Division of complex number : "+ C3.real + " + i"+ C3.imaginary); 
	} 
} 
