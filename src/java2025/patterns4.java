package java2025;

public class patterns4 {
	public static void main(String args[]) {
		int n=3;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<n;k++) {
				System.out.print("-");
			}
			for(int l=0;l<n-n+i+1;l++) {
				System.out.print("^");
			}
			System.out.println();
		}
		
	
	
		}
	
	}


