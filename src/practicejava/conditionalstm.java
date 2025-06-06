package practicejava;
import java.util.Scanner;

public class conditionalstm {
	public static void main(String args[]) {
		int salary=300;
		if(salary>=300) {
			salary=salary+100;
			System.out.println(salary);
		}
		else if(salary>100) {
			salary=salary+200;
			System.out.println(salary);
		}
		else {
			System.out.println("no conditions correct");
		}
		//for loop
		int[] num = {1,2,3,4,5};
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
			System.out.println(i);
		}
		//while loop
		int i=5;
		while(i>5) {
			System.out.println(i+1);
			i=i+1;
		}
		//while loop : if user press enter 3 end the program
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int j=0;
		while(val !=3) {
			j=j+1;
			System.out.println(j);
			//int val=sc.nextInt();
					
					
			
		}
		//do-while
		int k=1;
		do {
			System.out.println("helloworld");
			
			
		}while(k!=1);
		
		
	}

}
