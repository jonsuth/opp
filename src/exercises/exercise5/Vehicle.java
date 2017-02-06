package exercises.exercise5;

/**
 * Created by Jon Suthakaran on 05/02/2017.
 */
public class Vehicle {

    private Double horsepower;
    private Double aerodynamics;
    private Double weight;

    public Vehicle(Double horsepower, Double aerodynamics, Double weight) {
        this.horsepower = horsepower;
        this.aerodynamics = aerodynamics;
        this.weight = weight;
    }

    public Double getHorsepower() {
        return horsepower;
    }

    public Double getAerodynamics() {
        return aerodynamics;
    }

    public Double getWeight() {
        return weight;
    }

    public void setHorsepower(Double horsepower) {
        this.horsepower = horsepower;
    }

    public void setAerodynamics(Double aerodynamics) {
        this.aerodynamics = aerodynamics;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double acceleration() {
        return (100 / horsepower) * aerodynamics * weight / 100;
    }
}
