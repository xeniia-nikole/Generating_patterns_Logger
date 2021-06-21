import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запуск программы");

        logger.log("Просьба к пользователю о вводе размера числовой последовательности");
        System.out.println("Введите желаемое количество элементов:");
        int amount = scanner.nextInt();
        logger.log("Сохранение полученного значения в переменную");

        logger.log("Просьба к пользователю о вводе верхней границы последовательности");
        System.out.println("Введите желаемое максимальное число: ");
        int maxValue = scanner.nextInt();
        logger.log("Сохранение полученного значения в переменную");

        logger.log("Создание последовательности из " + amount + " позиций");
        logger.log("Наполнение последовательности рандомными элементами");
        List<Integer> numbers = createNewList(amount, maxValue);
        System.out.println("Полученная последовательность: ");
        numbers.forEach(number -> System.out.printf(" %s ", number));
        System.out.println();

        logger.log("Просьба к пользователю о вводе фильтра для последовательности");
        System.out.println("Введите желаемое значение, числа меньше которого будут отброшены:");
        int filter = scanner.nextInt();

        logger.log("Запуск фильтрации по последовательности");
        List<Integer> filteredList = Filter.filterOut(numbers, filter);
        System.out.println("Полученная последовательность: ");
        filteredList.forEach(number -> System.out.printf(" %s ", number));
        System.out.println();

        logger.log("Завершение программы");


    }

    private static List<Integer> createNewList(int amount, int maxValue) {
        List<Integer> source = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            source.add(random.nextInt(maxValue));
        }
        return source;
    }
}
