package java2025;
import java.util.Scanner;
import java.util.*;

public class mergelist {
	public static void main(String args[]){
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			al1.add(num);
			}
		for(int j=0;j<n;j++) {
			int num1=sc.nextInt();
			al2.add(num1);}
		
	    al.addAll(al1);
	    al.addAll(al2);
	    System.out.println(al);
		}
	     
	
	
}
