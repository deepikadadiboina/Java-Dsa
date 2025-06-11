package java2025;
import java.util.Arrays;
import java.util.Scanner;

public class smallestelementinarray {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int [] arr=new int[5];
		//int small=arr[0];
		System.out.println("enter array values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=in.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int small=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(small);
		
		
	}

}
