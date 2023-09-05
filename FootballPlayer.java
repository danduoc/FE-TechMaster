package BongDa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FootballPlayer {

	private String name;
	private int age;
	private String add;
	private double height;
	private double weight;
	private long salary;

	public FootballPlayer() {
		super();
	}

	public FootballPlayer(String name, int age, String add, double height, double weight, long salary) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
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

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Add: " + this.add);
		System.out.println("Height: " + this.height);
		System.out.println("Weight: " + this.weight);
		System.out.println("Salary: " + this.salary);
	}

	public static ArrayList<FootballPlayer> sortSalary(ArrayList<FootballPlayer> f) {
		Collections.sort(f, Comparator.comparingLong(FootballPlayer::getSalary));
		return f;
	}

}
