import java.util.Scanner;
import java.lang.Math;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int a1 =0;
		int a2 = 1;
		if (n < 2) {
			System.out.print(a1+" ");
		} else {
				System.out.print(a1+" ");
				System.out.print(a2+" ");
				int ai = 0;
				for (int i = 3; i <= n; i++) {
					ai = a1 + a2;
					a1 = a2;
					a2 = ai;
					System.out.print(ai+" ");
			}
		}
		
		
	}
}
