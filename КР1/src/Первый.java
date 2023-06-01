import java.util.Scanner;
public class Первый {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 1");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            System.out.println(distance(x1, y1, x2, y2));
        }

        public static double distance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    }
