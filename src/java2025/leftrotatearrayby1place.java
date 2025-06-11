package java2025;

public class leftrotatearrayby1place {
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,6};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1-i]=temp;
		
		System.out.println(arr[i]);
				
		
	}

}
