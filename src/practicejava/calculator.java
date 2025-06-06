package practicejava;
import java.util.Scanner;

public class calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);

	
		System.out.println("enter symbol");
		String symbol=sc.next();
		System.out.println("enter a and b values ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
	
		switch(symbol) {
		
		case "+":
			int c=a+b;
			System.out.println(c);
			break;
		case "-":
			int d=a-b;
			System.out.println(d);
			break;
		case "*":
			int e=a*b;
			System.out.println(e);
			break;
		case "/":
			int f=a/b;
			System.out.println(f);
			break;
		case "%":
			int h=a%b;
			System.out.println(h);
			break;
		default:
			System.out.println("enter a valid input symbol");
			
			
			
		
		}
		
	}
	

}
