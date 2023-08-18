import java.util.Arrays;
import java.util.Scanner;

import javax.swing.ButtonGroup;

import java.lang.Math;

public class xoaPTLe {
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
		int j = 0;
        for (int i = 0; i < n; i++) {
			if (i%2 == 0 || a[i]%2 == 0) {
				   a[j] = a[i];
				   j++;
				}		
		}
        int[] result = Arrays.copyOf(a, j);
        
        System.out.println("Mảng sau khi xoá các phần tử có chỉ số lẻ và giá trị lẻ: " + Arrays.toString(result));
	}
}
