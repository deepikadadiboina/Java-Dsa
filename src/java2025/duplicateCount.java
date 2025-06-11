package java2025;
import java.util.*;
import java.util.Scanner;

public class duplicateCount {
	public static void main(String args[]) {
		ArrayList<String> ar=new ArrayList<>();
		ArrayList<String> counted=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String values=sc.nextLine();
			ar.add(values);
			
		}
		System.out.println(ar);
		String maxword="";
		int maxcount=1;
		for(int i=0;i<n;i++) {
			String current=ar.get(i);
			int count=0;
			
			if(!counted.contains(current)) {
				for(int j=0;j<ar.size();j++) {
					if(ar.get(j).equals(current)) {
						count++;
					}
				}
			
				if(count>maxcount) {
					maxcount=count;
					maxword=current;
				}
				counted.add(current);
			}
				
			if(count>1) {
				System.out.println(current+"->"+count);
				
			}
			}
			if(maxcount>1) {
				System.out.println("Most repeated value: " + maxword + " -> " + maxcount + " times");
				
			}
			else {
				System.out.println("no duplicates");
			}
			//counted.add(current);
			
			
		
			
		
				
			
		
		
	}

}
