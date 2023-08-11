public class BangCuuChuong {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf(j+ " x " +i+ " = " +i * j+ "\t");
//              if (i*j>=10) {
//                	System.out.print(" ");
//				} else {
//					System.out.print("  ");
//				}                if (i>=10 || j >=10) {
//                	System.out.print(" ");
//				} else {
//					System.out.print("  ");
//				}
            }
            System.out.println();
        }
    }
}