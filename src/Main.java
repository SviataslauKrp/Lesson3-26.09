import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String delimiter = "================================\n";

        dz1();
        System.out.println(delimiter);
        
        dz2();
        System.out.println(delimiter);

        dz3();
        System.out.println(delimiter);

        dz4();
    }

//    4. По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.).
    private static void dz4() {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String color;

        switch (number) {
            case 1: color = "Красный";
            break;
            case 2: color = "Оранжевый";
            break;
            case 3: color = "Желтый";
            break;
            case 4: color = "Зеленый";
            break;
            case 5: color = "Голубой";
            break;
            case 6: color = "Синий";
            break;
            case 7: color = "Фиолетовый";
            break;
            default: color = "Не радужный цвет";
        }

        System.out.println(color);

//Scanner не закрыт: https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input

    }

    //    3. Для введенного числа t (температура на улице) вывести. Если t>–5, то вывести «Тепло». Если –5>= t > –20, то вывести «Нормально».
//    Если –20>= t, то вывести «Холодно»
    private static void dz3() {

        Scanner console = new Scanner(System.in);
// для проверки 3х значений из каждого из диапазонов
        for (int i = 0; i < 3; i++) {
            int t = console.nextInt();

            if (t > -5) {
                System.out.println("Тепло");
            } else if (t > -20) {
                System.out.println("Нормально");
            } else System.out.println("Холодно");
        }

//Scanner не закрыт: https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input

    }

//  2. Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор if-else-if.
    private static void dz2() {

        final int startIndex = 1;
        final int endIndex = 12;
        int month = (int) (Math.random() * ((endIndex - startIndex) + 1)) + startIndex;
        String timeOfTheYear;

        if (month > 2 && month < 6) {
            timeOfTheYear = "Spring";
        } else if (month > 5 && month < 9) {
            timeOfTheYear = "Summer";
        } else if (month > 8 && month < 12) {
            timeOfTheYear = "Autumn";
        } else {
            timeOfTheYear = "Winter";
        }

        System.out.println(timeOfTheYear);

    }

//    1. Написать программу для вывода названия поры года по номеру месяца. При решении используйте оператор switch-case
    private static void dz1() {

        final int startIndex = 1;
        final int endIndex = 12;
        int month = (int) (Math.random() * ((endIndex - startIndex) + 1)) + startIndex;
        String timeOfTheYear;

        switch (month) {

            case 1:
            case 2:
            case 12:
                timeOfTheYear = "Winter";
                break;
            case 3:
            case 5:
            case 4:
                timeOfTheYear = "Spring";
                break;
            case 6:
            case 8:
            case 7:
                timeOfTheYear = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                timeOfTheYear = "Autumn";
                break;
            default: timeOfTheYear = "Не знаем такого";

        }

        System.out.println(timeOfTheYear);

    }
}