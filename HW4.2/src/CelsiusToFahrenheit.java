/**
 * Created by stasp on 8/17/2016.
 */
import java.util.Scanner;

public class CelsiusToFahrenheit {
    static double FahrenheitTemperature(double degreeCelsius) {
        double degreeFahrenheit;
        degreeFahrenheit = degreeCelsius * 9 / 5 + 32;
        return degreeFahrenheit;
    }

    public static void main(String[] args) {
        System.out.print("Введите температуру в градусах Цельсия:");
        Scanner sc = new Scanner(System.in);
        double degreeCelsius = sc.nextDouble();
        System.out.println(FahrenheitTemperature(degreeCelsius));
    }
}
