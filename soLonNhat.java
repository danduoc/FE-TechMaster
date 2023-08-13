import java.util.Scanner;
import java.lang.Math;

public class soLonNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("N=");
		n = sc.nextInt();
		int max = 0;
		for (int i = 1; i <= n; i++) {
			max = 10 * max + 9;
		}
		
			System.out.println("Số nguyên dương lớn nhất có " +n+ " chữ số là: " +max);
	}
}
