package java2025;
import java.util.Scanner;

public class arraynew {
	public static void main(String args[]) {
	int[] arr=new int[5];
	Scanner in=new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	//for(int i=0;i<arr.length;i++) {
	//	System.out.println(arr[i]);
	//}
	//for(int num:arr) {
		//System.out.println(num);
	//}
	System.out.println(Arrays.toString(arr));

}
}
