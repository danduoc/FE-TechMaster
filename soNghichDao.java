import java.util.Scanner;
import java.lang.Math;

public class soNghichDao {
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
		
			System.out.print("Ngịch đảo của số " +n+ " là: " +nd);
	}
}
