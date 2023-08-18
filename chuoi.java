
public class chuoi {
	public static void main(String[] args) {
		String cau = "Hello every one";
		char chuCanTim = 'e';
		int dem = 0;
		for (int i = 0; i < cau.length(); i++) {
			if (cau.charAt(i) == chuCanTim) {
                dem++;
                System.out.println("Vị trí thứ " + dem + " của chữ '" + chuCanTim + "' là : " + (i+1));
            }
        }
		
		System.out.println("Chữ '" + chuCanTim + "' xuất hiện " + dem + " lần.");
	}
}
