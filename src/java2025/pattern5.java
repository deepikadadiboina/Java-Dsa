package java2025;

public class pattern5 {
	public static void main(String args[]){
	int n=3;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			System.out.print("-");
			
		}
		for(int k=0;k<n;k=k++) {
			for(int l=1;l<n;l=l+2) {
	
				System.out.print("*");
			}
		
			System.out.println();
		}
		}
		
	
	}

}
