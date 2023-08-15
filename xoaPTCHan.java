import java.util.Scanner;

public class xoaPTCHan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng a: ");
		for (int i = 0; i < n; i++) {
			System.out.println("a [" +i+ "] = " +arr[i]);
		}
		System.out.println("Mảng a sau khi tăng các phần tử chẵn lên 1 đơn vị: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] %2 == 0) {
                arr[i]++;
            }
            System.out.println("a [" +i+ "] = " +arr[i]); 
        }
    }
}