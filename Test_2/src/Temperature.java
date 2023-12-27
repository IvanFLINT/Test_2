import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        int t = sc.nextInt();
        if (t <= -20) {
            System.out.println("Cold");
        } else if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Hot");

        }
        sc.close();
    }
}
