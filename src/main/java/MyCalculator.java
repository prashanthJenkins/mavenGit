import java.util.Scanner;

public class MyCalculator
{
	static float a;
	static float b;
	static float res;
    static char choice;
	char ch;
	
	public static float add(float a, float b){
		 return res = a + b;
	}
	public static float substract(float a, float b){
		 return res = a - b;
	}
	public static float multiply(float a, float b){
		 return res = a * b;
	}
	public static float divide(float a, float b){
		 return res = a / b;
	}
	
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
		a = 5;
		b = 2;
		
		System.out.print("1. Addition = "+add(a,b));
		System.out.print("2. Subtraction = "+substract(a, b));
		System.out.print("3. multiplication = "+multiply(a, b));
		System.out.print("4. division = "+divide(a,b));
		
            
    }
}