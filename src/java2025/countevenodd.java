package java2025;

public class countevenodd {
	public static void main(String args[]) {
		int[] arr= {1,2,3,4,5,5};
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount=evencount+1;
			}else {
				oddcount=oddcount+1;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
