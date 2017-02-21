package exercises.exercise3;

/**
 * Created by Jon Suthakaran on 06/02/2017.
 */
public class MiddleNumber {
    public static void main(String[] args) {

        System.out.println(middle(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));

    }

    public static Double middle(Double num1, Double num2, Double num3) {
        if (num1 > num2) {
            if (num2 > num3) {
                return num2;
            } else if(num1 > num3) {
                return num3;
            } else {
                return num1;
            }
        } else {
            if (num1 > num3) {
                return num1;
            } else if (num2 > num3) {
                return num3;
            } else {
                return num2;
            }
        }
    }
}
