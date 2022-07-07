import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        int day =13;    // По дефолту год невисокосный

        if (isLeapYear(year)) {
            day = 12;   // 12 если год високосный
        }

        System.out.println(day + ".09." + year);
    }

    public static boolean isLeapYear(int year) {
        // true если год кратен четырем и (не кратен ста или кратен четырехста)
        // && работает слева направо, следовательно при первом false вернется false
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
