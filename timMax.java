import java.util.Scanner;

public class timMax {
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
		int max1 = 0, max2 = 0;
		for (int i = 0; i < n; i++) {
			if (a[i]>max1) {
				max2 = max1;
				max1 = a[i];
			}else if (a[i] > max2) {
				max2 = a[i];
			}
		}
		System.out.printf("Giá trị lớn nhất của mảng là %d\n", max1);
        System.out.printf("Giá trị lớn thứ 2 của mảng là %d\n", max2);
	}
}
