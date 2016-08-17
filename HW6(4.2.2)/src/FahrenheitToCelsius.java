/**
 * Created by stasp on 8/17/2016.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheitToCelsius {
    static double CelsiusTemperature(double degreeFahrenheit) {
        double degreeCelsius;
        degreeCelsius = (degreeFahrenheit-32) * 5/9 ;
        return degreeCelsius;
    }

    public static void main(String[] args) {
        try {
            System.out.print("Введите температуру в градусах Фаренгейта:");
            Scanner sc = new Scanner(System.in);
            double degreeFahrenheit = sc.nextDouble();
            System.out.println("Температура в Цельсиях:"+""+CelsiusTemperature(degreeFahrenheit));}
        catch (InputMismatchException e) {
            System.out.println("Вы ввели букву, а необходимо цифру!");}
    }
}
