import java.util.Scanner;

public class LessomThree1 {
    public static void main(String[] args) {
        System.out.print("Введите температуру по цельсию: ");
        double tempC = new Scanner(System.in).nextDouble();
        System.out.println("Температура по цельсию равна: "+ tempC + ", а температура по кельвину равна: " + (tempC * 1.8 + 32));
    }
}
