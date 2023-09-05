import java.util.ArrayList;

public abstract class Person {
	private String name;
	private int age;
	private String tel;
	private String sex;

	public Person() {
		super();
	}

	public Person(String name, int age, String tel, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void display() {
		System.out.println("Tên: " + this.name);
		System.out.println("Tuổi: " + this.age);
		System.out.println("Điện thoại: " + this.tel);
		System.out.println("Giới tính: " + this.sex);
	}

	public abstract long salary();

	public static ArrayList<Person> findPersonByName(ArrayList<Person> listP, String name) {
		ArrayList<Person> lp = new ArrayList<Person>();
		for (Person p : listP) {
			if (p.getName().equals(name)) {
				lp.add(p);
			}
		}
		return lp;
	}
}
