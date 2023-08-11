import java.util.Scanner;
import java.lang.Math;

public class soDoiXung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int nd =0;
		int m = n;
		while (m>0) {
			nd = nd*10 + m%10;
			m /=10;
		}
		if (n == nd) {
			System.out.print("là số đối xứng");
		} else {
			System.out.print("không phải là số đối xứng");
		}
	}
}
