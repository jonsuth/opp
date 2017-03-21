package exercises.exercise6;

import exercises.exercise5.Vehicle;

/**
 * Created by Jon Suthakaran on 05/02/2017.
 */
public class Van extends Vehicle {

    private Double carryWeight;

    public Van(Double horsepower, Double aerodynamics, Double weight, Double carryWeight) {
        super(horsepower, aerodynamics, weight);
        this.carryWeight = carryWeight;
    }

    public Double getCarryWeight() {
        return carryWeight;
    }

    @Override
    public Double acceleration() {
        return (100 / getHorsepower()) * (getAerodynamics() / 2) * getWeight() / 100;
    }
}
