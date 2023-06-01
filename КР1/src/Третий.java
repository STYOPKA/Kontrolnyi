import java.util.Scanner;

    public class Третий {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int num;
            System.out.println("укажите последовательность чисел, последнее число равняется нулю 0:");
            num = scanner.nextInt();

            while (num != 0) {
                sum += num;
                num = scanner.nextInt();
            }
            System.out.println("сумма последовательности: " + sum);
        }
    }

