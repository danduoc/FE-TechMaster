import java.util.Scanner;
import java.lang.Math;

public class timm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("N=");
			n = sc.nextInt();
			
		} while (n <= 0);
		
		int m = 0;
		int tong = 0;
		
		while (tong < n) {
			m ++;
			tong += m;
		}
//		do {
//			m ++;
//			tong += m;
//		} while (tong < n);
		m = m-1;
		System.out.println("số m là " + m);
	}
}
