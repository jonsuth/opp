package exercises.exercise6;

/**
 * Created by Jon Suthakaran on 05/02/2017.
 */
public class TestAcceleration {

    public static void main(String[] args) {
        SportCar car1 = new SportCar(200.0, 1500.0, 220.0);
        SportCar car2 = new SportCar(100.0, 1000.0, 170.0);
        SportCar car3 = new SportCar(135.0, 1100.2, 173.0);
        Van van = new Van(100.0, 0.9, 3500.0, 1604.0);

        System.out.println(car1.acceleration());
        System.out.println(car2.acceleration());
        System.out.println(car3.acceleration());
        System.out.println(van.acceleration());
    }
}
