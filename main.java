import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		
		ArrayList<PT> listPT = new ArrayList<>();
		listPT.add(new PT("Tuan", 36, "080-2040-5465", "men", 112, 1200));
		listPT.add(new PT("Truc Anh", 8, "080-2040-5465", "women", 120, 1250));
		listPT.add(new PT("Nhat",28,"1111","men",110,1200));
		ArrayList<FT> listFT = new ArrayList<>();
		listFT.add(new FT("Tu Anh", 35, "070-3795-0002", "women", 22, 10000));
		listFT.add(new FT("Huong",29,"1111","women",21,10000));
		listFT.add(new FT("Cuong",32,"0000","men",25,11000));
		ArrayList<PT> maxSalaryPT = new ArrayList<PT>();
		maxSalaryPT = PT.findMaxSalary(listPT);
		for (Person p : maxSalaryPT) {
			p.display();
		}
		ArrayList<FT> maxSalaryFT = new ArrayList<FT>();
		maxSalaryFT = FT.findMaxSalary(listFT);
		for (Person p : maxSalaryFT) {
			p.display();
		}
	}
}
