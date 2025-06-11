package java2025;

public class secondlargestelement {
	public static void main(String args[]) {
	int[] arr= {22,44,56,77,66};
	int lar=arr[0];
	int selar=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>lar) {
			lar=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>selar && arr[i]!=lar) {
			selar=arr[i];
		}
	}

	
	System.out.println(lar);
	System.out.println(selar);

}
}
