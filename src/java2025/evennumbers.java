package java2025;
import java.util.*;
import java.util.Scanner;

public class evennumbers {
	public static void main(String args[]) {
	Vector<Integer> v=new Vector<>();
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum1=0;
	
	for(int i=0;i<n;i++) {
		int num=sc.nextInt();
		v.add(num);
		if((v.get(i))%2==0) {
			sum1=sum1+v.get(i);
			
		}
		}
	System.out.println(sum1);
	

}
}
