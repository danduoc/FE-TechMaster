import java.util.Scanner;
import java.lang.Math;

public class demSoHoanHao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int dem = 0;
		
		while (n != 0 ) {
			System.out.print("mời bạn nhập số ");
			n = sc.nextInt();
			int tongUoc = 0;
			for (int i = 1; i <= n-1; i++) {
				if (n%i ==0) {
					tongUoc += i;
				}
			}
			if (tongUoc == n && tongUoc >0) {
				dem++;
			}
		}
			System.out.println("có "+dem+" số hoàn hảo");
		
	}
}
