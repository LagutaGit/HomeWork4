import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


//        Задача 1


        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

//      Задача 2


        int clientDeviceYear = 2018;
        clientOS = 0;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

//       задача 3


        int year = 2021;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год является не високосный");
        }

// задача 4

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }

//        5 Task


        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
            case 3, 4, 5:
                System.out.println("Весна");
            case 6, 7, 8:
                System.out.println("Лето");
            case 9, 10, 11:
                System.out.println("Осень");
            default:
                System.out.println("Такого месяца нет");
        }

    }
}