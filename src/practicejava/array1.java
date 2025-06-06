package practicejava;
import java.util.Scanner;
import java.util.Arrays;
public class array1 {
	public static void display(int[] arr) {
		System.out.println("array elements");
		for(int num:arr) {
			System.out.print(num + " ");
			}
		System.out.println();
	}
	public static int min(int[] arr) {
		int mi=arr[0];
		for(int num:arr) {
			if(num<mi) {
				mi=num;
				
				
			}
		}
	
		return mi;
	}
	public static int max(int[] arr) {
		int max=arr[0];
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		return max;
		
		
	
	}
	public static int sum(int[] arr) {
		int ini=0;
		for(int num:arr) {
			ini=ini+num;
		}
		return ini;
	}


public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		
	}
	display(arr);
	System.out.println(min(arr));
	System.out.println(max(arr));
	System.out.println(sum(arr));
	
	
	
}
}

