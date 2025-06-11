package java2025;

public class largestelementinaarray {
	public static void main(String args[]) {
	int[] arr= {23,99,66,77,88};
	int lar=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>lar) {
			lar=arr[i];
	
		}
	
	}
	System.out.println(lar);
	}
	

}
