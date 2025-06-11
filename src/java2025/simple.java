package java2025;
import java.util.Scanner;

public class simple {
	public static void main(String args[]) {
	Scanner inp =new Scanner(System.in);
	System.out.println("enter a and b value");
	int a=inp.nextInt();
	int b=inp.nextInt();
	int c=a%b;//remainder
	int d=a/b;//quot
	System.out.println(c);
	System.out.println(d);
	

}
}

