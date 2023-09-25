package bt1;

import java.util.Scanner;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double chuVi() {
        return 2 * Math.PI * radius;
    }
    public double dienTich() {
        return Math.PI * radius * radius;
    }

    public void displayData() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("chuVi: " + chuVi());
        System.out.println("dienTich: " + dienTich());
    }
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter the color: ");
        color = scanner.nextLine();
    }
}
