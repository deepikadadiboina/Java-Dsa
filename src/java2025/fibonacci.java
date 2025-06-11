package java2025;
import java.util.Scanner;

public class fibonacci {
	public static void main(String args[]) {
		Scanner inp =new Scanner(System.in);
		int n=inp.nextInt();
		int a=0;
		int b=1;
		int temp;
		int count=2;
		while(count<n)
		{
			temp=b;
			b=b+a;
			a=temp;
			count=count+1;
					
		}
		System.out.println(b);
				
		
		
		
		
		
		
	}

}
