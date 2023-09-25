package bt1;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0, "Blue");

        circle1.inputData();

        System.out.println("---------------Circle 1-------------------");
        circle1.displayData();

        System.out.println("----------------Circle 2 ------------------");
        circle2.displayData();
    }
}
