package java2025;
import java.util.*;
import java.util.Scanner;

public class splittwoarr {
	public static void main(String args[]) {
		ArrayList<Integer> ar=new ArrayList<>();
		Vector<Integer>v1=new Vector<>();
		Vector<Integer>v2=new Vector<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			ar.add(num);}
			int len=ar.size();
		for(int j=0;j<len/2;j++) {
			v1.add(ar.get(j));}
			System.out.println(v1);
			
		
		for(int k=len/2;k<len;k++) {
			v2.add(ar.get(k));}
			System.out.println(v2);
			
		
			
		
		
		
	}

}
