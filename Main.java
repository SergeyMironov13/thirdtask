import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("ВВедите год");
            int year = scanner.nextInt();
            System.out.println("Введите количество дней");
            int days = scanner.nextInt();

            if (year % 400 == 0 && days == 366) {
                //System.out.println("Количество дней 366");

            } else if (year % 100 == 0 && days == 365) {
                //System.out.println("Количество дней 365");

            } else if (year % 4 == 0 && days == 366) {
                //System.out.println("Количество дней 366");

            } else if (days == 365){
                //System.out.println("Количество дней 365");
            } else {
                System.out.println("Неправильно! В этом году " + (true ? 365 : 366) + " дней!");
                break;
            }

            sum++;
        }

        System.out.println("Набрано очков: " + sum);
    }
}
