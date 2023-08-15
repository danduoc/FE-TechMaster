import java.util.Scanner;

import javax.swing.ButtonGroup;

import java.lang.Math;

public class xoaPTK {
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
		System.out.print("Nhập số K cần xoá: ");
        int k = sc.nextInt();
        for (int i = n-1; i >= 0; i--) {
			if (a[i] == k) {
				int j=i;
				for(i=j ; i < n-1 ; i++){
				   a[i] = a[i+1];
				}
				n--;
			}
		}
        System.out.println("mảng sau khi xóa "+k+" : ");
        for (int i = 0; i < n; i++) {
			System.out.println("a [" +i+ "] = " +a[i]);
        }
	}
}
