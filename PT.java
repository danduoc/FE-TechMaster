import java.util.ArrayList;

public class PT extends Person {
	private int hour;
	private long money;

	public PT() {
		super();
	}

	public PT(String name, int age, String tel, String sex, int hour, long money) {
		super(name, age, tel, sex);
		this.hour = hour;
		this.money = money;
	}

	public PT(int hour, long money) {
		super();
		this.hour = hour;
		this.money = money;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public long salary() {
		return this.money * this.hour;
	}

	public void display() {
		super.display();
		System.out.println("Lương: " + salary());
	}

	public static ArrayList<PT> findMaxSalary(ArrayList<PT> listP) {
		ArrayList<PT> nhap = new ArrayList<>();
		long maxS = 0;
		for (Person pt : listP) {
			if (pt.salary() > maxS) {
				maxS = pt.salary();
			}
		}
		for (PT pt : listP) {
			if (pt.salary() == maxS) {
				nhap.add(pt);
			}
		}
		return nhap;
	}
}
