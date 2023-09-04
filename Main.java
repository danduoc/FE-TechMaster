import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Transport transport1 = new Transport("Viet Nam","VinFast", 2021, 300);
        Car car1 = new Car("Viet Nam","VinFast", 2021, 300, 4, "Diesel");
        Car car2 = new Car("My", "Ford", 2020, 400, 5, "Petrol");
        Car car3 = new Car("Nhat", "Toyota", 2022, 500, 7, "Electric");
        
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        
        System.out.println("Transport:");
        transport1.display();
        System.out.println();

        ArrayList<Car> maxSpeedCars = Car.getCarHaveMaxSpeedBasic(cars);
        System.out.println("Car max speed basic Information:");
        for (Car car : maxSpeedCars) {
			car.display();
		}
        System.out.println();
        ArrayList<Car> maxSeatCars = Car.getCarHaveMaxSeat(cars);
        System.out.println("Car max Seat Information:");
        for (Car car : maxSeatCars) {
			car.display();
		}
    }
}