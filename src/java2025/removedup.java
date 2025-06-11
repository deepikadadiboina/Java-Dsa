package java2025;
import java.util.*;

public class removedup {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> ar=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ar.add(sc.nextInt());
		}
		Set<Integer> se=new LinkedHashSet<>(ar);
		ar.clear();
		ar.addAll(se);
		System.out.println(ar);
	}

}
