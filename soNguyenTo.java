import java.util.Scanner;

public class soNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N=");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("a [" +i+ "] = ");
			a[i] = sc.nextInt();
		}
		
		int dem = 0;
		for (int i = 0; i < n ; i++) {
			if (isPrime(a[i])) {
                dem++;
            }
        }
		System.out.println("Số lượng số chính phương là: "+dem);
	}
		
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		        }
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		        return true;
	}
}
