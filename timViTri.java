import java.util.Scanner;

public class timViTri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("a [" +i+ "] = ");
			a[i] = sc.nextInt();
		}
		System.out.print("Nhập K: ");
        int k = sc.nextInt();
        
        System.out.print("Vị trí của các phần tử bằng K là: ");
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                System.out.print(i + " ");
            }
        }
	}
}
