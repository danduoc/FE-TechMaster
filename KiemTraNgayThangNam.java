import java.util.Scanner;

public class KiemTraNgayThangNam {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.println("nhập ngày:");
	     int d = scanner.nextInt();
	     
	     System.out.println("nhập tháng:");
	     int m = scanner.nextInt();
	     
	     System.out.println("nhập năm:");
	     int y = scanner.nextInt();
	     
	     if (y < 1) {
	    	 System.out.println("ngày tháng năm không phù hợp");
	    	 return;
		}
	     
	     if (m < 1 || m > 12) {
	    	 System.out.println("ngày tháng năm không phù hợp");
	    	 return;
		}
	     
	     int maxd = 0;
	     
	     switch (m) {
		case 2: if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) {
            maxd = 29;
        } else {
            maxd = 28;
        }
        break;
		case 4:
        case 6:
        case 9:
        case 11:
            maxd = 30;
            break;
        default:
            maxd = 31;
            break;
    }

    if (d < 1 || d > maxd) {
    	System.out.println("ngày tháng năm không phù hợp");
        return;
    }
        int nextDay = d + 1;
        int nextMonth = m;
        int nextYear = y;

        if (nextDay > maxd) {
            nextDay = 1;
            nextMonth += 1;

            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear += 1;
            }
        }

        // In ra ngày tiếp theo
        System.out.printf("Ngày tiếp theo là: %d/%d/%d\n", nextDay, nextMonth, nextYear);
    
	 }
}
