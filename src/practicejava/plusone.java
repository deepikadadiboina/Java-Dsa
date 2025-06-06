package practicejava;
import java.util.*;

public class plusone {
	public static void main(String args[]) {
		int[] digits = {1,2,3,4};
		int len=digits.length-1;
		if(digits[len]==9) {
			digits=new int[]{1,0};
			System.out.println(Arrays.toString(digits));
			
		}
		//System.out.println(Arrays.toString(digits));
		else {
			int last=len+1;
			System.out.println(Arrays.toString(digits));
			
		}
		
		
	}

}
