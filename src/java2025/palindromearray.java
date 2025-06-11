package java2025;

public class palindromearray {
	public static void main(String args[]) {
		int[] arr= {1,2,2,2};
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==arr[arr.length - 1 - i]) {
			System.out.println("palindrome");
			break;
				
			}else {
			System.out.println("not");
			}
				
}

		
	
		
		
	}
}
