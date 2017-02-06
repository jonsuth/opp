package exercises.exercise4;

/**
 * Created by Jon Suthakaran on 05/02/2017.
 */
public class TestConsumption {

    public static void main(String[] args) {
        SportCar car1 = new SportCar(200.0, 1500.0, 220.0);
        SportCar car2 = new SportCar(100.0, 1000.0, 170.0);
        SportCar car3 = new SportCar(135.0, 1100.2, 173.0);

        computeFuelCompumtion(car1);
        computeFuelCompumtion(car2);
        computeFuelCompumtion(car3);

    }

    public static void computeFuelCompumtion(SportCar car) {
        System.out.println(
                (1000 + (car.getWeight() / 5)) *
                        (car.getTopSpeed() / 100) *
                        (car.getAerodynamics() * car.getHorsepower()) / 1000
        );
    }
}
