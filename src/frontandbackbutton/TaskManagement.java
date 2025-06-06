package frontandbackbutton;
import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class TaskManagement {
	public static void main(String main[]) {
		Queue<String> demo= new ArrayDeque<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the no.of task");
		int NoTask=sc.nextInt();
		//String Task=sc.nextLine();
		for(int i=0;i<=NoTask;i++) {
			System.out.println("enter the task" +(i+1)+":");
			String Task=sc.nextLine();
			demo.offer(Task);
			String input=sc.nextLine();
			if(input.equals("done")) {
				while (!demo.isEmpty()) {
				    String task = demo.poll();  // retrieves and removes the head
				    System.out.println("after poping: " + task);
				}

				
			}
			}
		//System.out.println(demo);
		
		
	}

}
