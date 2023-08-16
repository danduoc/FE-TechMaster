import java.util.Scanner;

public class soChinhPhuong {
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
			double sqrt = Math.sqrt(a[i]);
			if (sqrt == (int) sqrt) {
                dem++;
            }
        }
		System.out.println("Số lượng số chính phương là: "+dem);
	}
}
