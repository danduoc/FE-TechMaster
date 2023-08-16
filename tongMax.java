import java.util.Scanner;

public class tongMax {
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
			
		int tongMax = 0;
		for (int i = 0; i < n-1 ; i++) {
            if (tongMax < a[i] + a[i+1]) {
                tongMax = a[i] + a[i+1];
            }
        }
		System.out.println("tổng dãy con lớn nhất là: "+tongMax);
	}
}
