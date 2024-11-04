import java.util.Scanner;

public class LessonFour2 {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        double firstNumber = new Scanner(System.in).nextDouble();


        System.out.print("Введите второе число: ");
        double secondNumber = new Scanner(System.in).nextDouble();

        System.out.println("Сумма: " + (firstNumber + secondNumber));

        System.out.println("Разность: " + (firstNumber - secondNumber));

        System.out.println("Произведение: " + (firstNumber * secondNumber));

        System.out.println("Частное: " + (firstNumber / secondNumber));

    }
}
