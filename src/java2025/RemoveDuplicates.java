package java2025;
import java.util.Scanner;
import java.util.*;

public class RemoveDuplicates {
	public static void main(String args[]) {
		ArrayList<Integer> ar=new ArrayList<>();
		ArrayList<Integer> ar1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++) {
			int num1=sc.nextInt();
			ar.add(num1);}
		for(int num:ar) {
			if(!ar1.contains(ar)) {
				ar1.add(num);
			}
			}
		
		System.out.println(ar1);
		
			
		
	}

}
