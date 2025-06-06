package practicejava;
import java.util.Scanner;

public class calculator2 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		boolean flag=sc.hasNextBoolean();
		String symbol= sc.next();
		int a=sc.nextInt();
		int b=sc.nextInt();
		while(flag=true) {
			switch(symbol) {
			case"+"->System.out.println(a+b)break;
			case"-"->System.out.println(a-b)break;
			case"/"->System.out.println(a/b);
			case"%"->System.out.println(a%b);
			case"*"->System.out.println(a*b);
			default->System.out.println("enter a valid symbol");
			
				
			}
			
			
		}
		
	}

}
