
public class chuoi {
	public static void main(String[] args) {
		String cau = "Hello every one";
		char chuCanTim = 'e';
		int dem = 0;
		for (int i = 0; i < cau.length(); i++) {
			if (cau.charAt(i) == chuCanTim) {
                dem++;
                System.out.println("Vị trí (index) thứ " + dem + " của chữ '" + chuCanTim + "' là : " + i);
            }
        }
		
		System.out.println("Chữ '" + chuCanTim + "' xuất hiện " + dem + " lần.");
	}
}
