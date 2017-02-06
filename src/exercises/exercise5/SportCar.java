package exercises.exercise5;

/**
 * Created by Jon Suthakaran on 05/02/2017.
 */
public class SportCar extends Vehicle {

    private Double topSpeed;

    public SportCar(Double horsepower, Double weight, Double topSpeed) {
        super(horsepower, 0.5, weight);
        this.topSpeed = topSpeed;
    }

    public Double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }
}
