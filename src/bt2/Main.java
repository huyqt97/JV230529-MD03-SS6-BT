package bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị của a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị của b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị của c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phương trình có hai nghiệm:" + root1 + " và " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1();
            System.out.println("Phương trình có một nghiệm: " + root);
        } else {
            System.out.println("Phương trình Vô nghiệm:");
        }
    }
}






