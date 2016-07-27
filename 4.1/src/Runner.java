import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {
    public static void main(String[] args) throws IOException {

        ShapeUtil shape = new ShapeUtil();
        Figure figure1 = shape.readConsole();

        double calc = figure1.calc();
        System.out.println(calc);
    }
}

abstract class Figure {
    public abstract String getFigureType();

    public abstract String getInitialParams();

    public abstract double calc();

    @Override
    public String toString() {
        return "Please Enter initial parameters (coma is delimiter) for" + getFigureType() + ",with next params"
                + getInitialParams() + ".";
    }
}


class Rectangle extends Figure {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return this.getClass().toString();
    }


    @Override
    public double calc() {
        return weight * height;
    }

    @Override
    public String getInitialParams() {
        return "Please, enter height and weight for Rectangle.";
    }
}

class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getFigureType() {
        return this.getClass().toString();
    }

    @Override
    public String getInitialParams() {
        return "Please, enter radius for Circle.";
    }

    @Override
    public double calc() {
        return Math.PI * radius * radius;
    }
}


class Triangle extends Figure {
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getFigureType() {
        return this.getClass().toString();
    }

    @Override
    public String getInitialParams() {
        return "Please, enter height and weight for Triangle. ";
    }

    @Override
    public double calc() {
        return 0.5 * weight * height;
    }
}

class ShapeUtil {

    public static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public Figure readConsole() throws IOException {


        System.out.println("Please enter type of Figure (Rectangle, Triangle, Circle) or enter Quit for exit: ");

        String s = BUFFERED_READER.readLine();
        String[] split;
        switch (s) {
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                split = readParams(rectangle);

                Double height = Double.parseDouble(split[0]);
                Double weight = Double.parseDouble(split[1]);

                rectangle.setHeight(height);
                rectangle.setWeight(weight);
                return rectangle;
            case "Triangle":
                Triangle triangle = new Triangle();
                split = readParams(triangle);

                Double height1 = Double.parseDouble(split[0]);
                Double weight1 = Double.parseDouble(split[1]);

                triangle.setHeight(height1);
                triangle.setWeight(weight1);
                return triangle;
            case "Circle":
                Circle circle = new Circle();
                split = readParams(circle);
                Double radius = Double.parseDouble(split[0]);
                circle.setRadius(radius);
                return circle;
            case "Quit":
                System.exit(1);
            default:
                readConsole();
        }
        return null;
    }

    private String[] readParams(Figure figure) throws IOException {
        System.out.println(figure);
        String inputForRectangle = BUFFERED_READER.readLine();
        return inputForRectangle.split(",");
    }
}
