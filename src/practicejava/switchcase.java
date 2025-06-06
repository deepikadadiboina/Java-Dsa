package practicejava;
import java.util.Scanner;

public class switchcase {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String fruit=sc.next();
		
		switch(fruit) {
		
		case "mango":
			System.out.println("yellow fruit");
			break;
		case "orange":
			System.out.println("orange fruit");
		case "grapes":
			System.out.println("green fruit");
		default:
			System.out.println("enter the valid fruit");
		}
		
	
	}
	

}
