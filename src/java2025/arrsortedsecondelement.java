package java2025;

public class arrsortedsecondelement {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,4};
		int lar=arr[0];
		int sec=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>lar) {
				lar=arr[i];
			}
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=lar) {
				sec=arr[i];
				break;
				
			}
		}
		System.out.println(sec);
	}

}
