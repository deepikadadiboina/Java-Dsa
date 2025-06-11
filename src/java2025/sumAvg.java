package java2025;
import java.util.*;
import java.util.Arrays;

import java.util.ArrayList;

public class sumAvg {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum1=0;
		int avg;
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			arr.add(num);
		
		
			//System.out.println(arr);
			}
		System.out.println(arr);
		for(int j=0;j<n;j++) {
		sum1=sum1+arr.get(j);}
		avg=sum1/n;
		
		System.out.println(sum1);
		System.out.println(avg);
		
		

	}

}
