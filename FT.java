import java.util.ArrayList;

public class FT extends Person {
	private int day;
	private long money;

	public FT() {
		super();
	}

	public FT(int day, long money) {
		super();
		this.day = day;
		this.money = money;
	}

	public FT(String name, int age, String tel, String sex, int day, long money) {
		super(name, age, tel, sex);
		this.day = day;
		this.money = money;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public long salary() {
		return this.money * this.day;
	}

	public void display() {
		super.display();
		System.out.println("Lương: " + salary());
	}
	public static ArrayList<FT> findMaxSalary(ArrayList<FT> listP) {
		ArrayList<FT> nhap = new ArrayList<>();
		long maxS = 0;
		for (Person pt : listP) {
			if (pt.salary() > maxS) {
				maxS = pt.salary();
			}
		}
		for (FT pt : listP) {
			if (pt.salary() == maxS) {
				nhap.add(pt);
			}
		}
		return nhap;
	}
}
