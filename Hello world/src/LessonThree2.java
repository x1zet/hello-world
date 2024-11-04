import java.util.Scanner;

public class LessonThree2 {
    public static void main(String[] args) {
        System.out.print("Введите сколько рублей нужно для конвертации: ");

        double rubles = new Scanner(System.in).nextDouble();

        double dollar = 99;
        double euro = 107.7;

        System.out.println(rubles + " рублей равно " + ((rubles*1)/dollar) + " долларов");
        System.out.println(rubles + " рублей равно " + ((rubles*1)/euro) + " евро");

    }
}
