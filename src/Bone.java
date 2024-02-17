import java.util.Random;
import java.util.Scanner;

public class Bone {

    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Добро пожаловать в игру Кинуть кости!");
        System.out.println("Компьютер загадал число от 1 до 100.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Попробуй угадать число: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат.");
            } else if (guess > secretNumber) {
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат.");
            } else {
                System.out.println("Красавчик! Ты угадал число за " + attempts + " попыток.");
                break;
            }
        }
    }
}
