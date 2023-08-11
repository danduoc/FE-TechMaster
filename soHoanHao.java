import java.util.Scanner;
import java.lang.Math;

public class soHoanHao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int tongUoc = 0;
		for (int i = 1; i <= n-1; i++) {
			if (n%i ==0) {
				tongUoc += i;
			}
		}
		if (tongUoc == n && tongUoc >0) {
			System.out.println(n+" là số hoàn hảo");
		} else {
			System.out.println(n+" không phải là số hoàn hảo");
		}
	}
}
