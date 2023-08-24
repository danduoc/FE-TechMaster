import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 20;
		System.out.println("Dãy số Fibonacci từ 0 đến " +n+ " là: ");
		for (int i = 0; i <= n; i++) {
			System.out.print(Fibonacci(i)+" ");
		}
	}
	static int Fibonacci (int n) {
		if (n==0)return 0;
		if (n==1)return 1;
		return Fibonacci(n -1) + Fibonacci(n-2);
	}
}
