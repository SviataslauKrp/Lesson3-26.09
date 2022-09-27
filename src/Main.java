import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String delimiter = "================================\n";
        final String hat = "Управляющие конструкции";
        final String hat2 = "Циклы";
        final String hat3 = "Дополнительное задание";

        //управляющие конструкции

        System.out.println(hat +  "1:");
        dz1();
        System.out.println(delimiter);

        System.out.println(hat +  "2:");
        dz2();
        System.out.println(delimiter);

        System.out.println(hat +  "3:");
        dz3();
        System.out.println(delimiter);

        System.out.println(hat +  "4:");
        dz4();
        System.out.println(delimiter);

        //циклы

        System.out.println(hat2 + "1:");
        dz5();
        System.out.println(delimiter);

        System.out.println(hat2 + "2:");
        dz6();
        System.out.println(delimiter);

        System.out.println(hat2 + "3:");
        dz7();
        System.out.println(delimiter);

        System.out.println(hat2 + "4:");
        dz8();
        System.out.println(delimiter);

        System.out.println(hat2 + "5:");
        dz9();
        System.out.println(delimiter);

        System.out.println(hat2 + "6:");
        dz10();
        System.out.println(delimiter);

        //Дополнительные задания

        System.out.println(hat3 + "1:");
        dz11();
        System.out.println(delimiter);

        System.out.println(hat3 + "2:");
        dz12();
        System.out.println(delimiter);
        System.err.println("Вопрос о закрытии Console");
        
    }

    //      12. Напишите программу, которая выводит на консоль таблицу умножения
    private static void dz12() {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int result = j * i;
                int length = (int) (Math.log10(result) + 1);
                System.out.print(result + " ");
                if (length == 1) {
                    System.out.print("  ");
                } else if (length == 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    //      11. Выведите на экран первые 11 членов последовательности Фибоначчи.
    private static void dz11() {

        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber + " " + secondNumber + " ");

// 9 итераций потому, как первые 2 числа ряда выведены выше
        for (int i= 0; i < 9; i++) {

            int nextNumber = firstNumber + secondNumber;

            firstNumber = secondNumber;
            secondNumber = nextNumber;

            System.out.print(nextNumber + " ");
        }
        System.out.println();
    }

    //      10. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
    private static void dz10() {

        for (int i = 10; i < 21; i++) {
            int square = (int) Math.pow(i, 2);
            System.out.print(square + " ");
        }
        System.out.println();
    }

    //      9. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
    private static void dz9() {

        for (int i = 0; i > -50; i-=5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //      8. Необходимо, чтоб программа выводила на экран вот такую
    //последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    //В решении используйте цикл while.
    private static void dz8() {

        final int multipliable = 7;
        int multiplier = 1;
        int multiplication = 0;

        while (multiplication != 98) {
            multiplication = multipliable * multiplier;
            System.out.print(multiplication + " ");
            multiplier++;
        }
        System.out.println();
    }

    //      7. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner
    private static void dz7() {

        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int sum = 0;

        for (int i = 1; i < number; i++) {
            sum +=i;
        }
        System.out.println(sum);

        //Scanner не закрыт: https://stackoverflow.com/questions/13042008/java-util-nosuchelementexception-scanner-reading-user-input
    }

    //      6. Необходимо вывести на экран числа от 5 до 1. При решении используйте операцию декремента (--).
    private static void dz6() {

        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //     5. При помощи цикла for вывести на экран нечетные числа от 1 до 99. При решении используйте операцию инкремента (++).
    private static void dz5() {

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

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