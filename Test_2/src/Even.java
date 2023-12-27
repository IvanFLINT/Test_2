import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Введенное число четное");
        } else {
            System.out.println("Введенное число нечетное");
        }
    }
}
