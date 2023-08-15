import java.util.Scanner;

import javax.swing.ButtonGroup;

import java.lang.Math;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N=");
		int n = sc.nextInt();
		int[] a;
		a = new int[n];
		int tong = 0;
		int tongAm = 0;
		int tongDuong = 0;
		//nhập mảng
		for (int i = 0; i < n; i++) {
			System.out.println("a [" +i+ "] = ");
			a[i] = sc.nextInt();
		}
		//in ra mảng và tính tổng âm dương, trung bình của mảng
		System.out.println("Mảng a:");
		for (int i = 0; i < n; i++) {
			System.out.println("a [" +i+ "] = " +a[i]);
			tong += a[i];
			if (a[i]>0) {
				tongDuong += a[i];
			}
			if (a[i]<0) {
				tongAm += a[i];
			}
		}
		double trungBinh = (double) tong/n;
		System.out.println("tổng các số dương của mảng là: " +tongDuong);
		System.out.println("tổng các số âm của mảng là: " +tongAm);
		System.out.println("trung bình các số trong mảng là: " +trungBinh);
	}
}
