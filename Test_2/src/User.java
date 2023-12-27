import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int a = sc.nextInt();
        if (a > 99 && a < 1000) {
            int sum = 0;
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
            System.out.println("Сумма всех чисел = " + sum);
        } else {
            System.out.println("Не соответствует условию");
        }
        sc.close();
    }

}

