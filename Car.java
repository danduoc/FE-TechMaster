import java.util.ArrayList;

class Car extends Transport {
	private int numberOfSeats;
	private String engineType;

	public Car() {
		super();
	}

	public Car(String manufacturer, String name, int year, int speed, int numberOfSeats, String engineType) {
		super(manufacturer, name, year, speed);
		this.numberOfSeats = numberOfSeats;
		this.engineType = engineType;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public double getSpeedBasic() {
		return getSpeed() / this.numberOfSeats;
	}

	public void display() {
		System.out.println("Manufacturer: " + getManufacturer());
		System.out.println("Name: " + getName());
		System.out.println("Year of manufacturer: " + getYear());
		System.out.println("Speed: " + getSpeed());
		System.out.println("Number Of Seats: " + this.numberOfSeats);
		System.out.println("Engine Type: " + this.engineType);
		System.out.println("Basic speed: " + getSpeedBasic());
	}

	public static ArrayList<Car> getCarHaveMaxSpeedBasic(ArrayList<Car> cars) {
		ArrayList<Car> maxSpeedCars = new ArrayList<>();
		double maxValue = 0;

		for (Car car : cars) {
			if (car.getSpeedBasic() > maxValue) {
				maxValue = car.getSpeedBasic();
				maxSpeedCars.clear();
				maxSpeedCars.add(car);
			} else if (car.getSpeedBasic() == maxValue) {
				maxSpeedCars.add(car);
			}
		}

		return maxSpeedCars;
	}
	
	public static ArrayList<Car> getCarHaveMaxSeat(ArrayList<Car> cars) {
		ArrayList<Car> maxSeatsCar = new ArrayList<>();
		double maxSeat = 0;

		for (Car car : cars) {
			if (car.getNumberOfSeats() > maxSeat) {
				maxSeat = car.getNumberOfSeats();
				maxSeatsCar.clear();
				maxSeatsCar.add(car);
			} else if (car.getNumberOfSeats() == maxSeat) {
				maxSeatsCar.add(car);
			}
		}

		return maxSeatsCar;
	}
}