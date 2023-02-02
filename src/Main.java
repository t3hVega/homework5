public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        System.out.println("ДЗ сделано");
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Приложение не поддерживается вашей ОС :(");
        }
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        }
    }
    public static void task3() {
        System.out.println("Задача 3:");
        int year = 2024;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год является невисокосным");

    }
    public static void task4() {
        System.out.println("Задача 4:");
        int deliveryDays = 1;
        int deliveryDistance = 60;
        if (deliveryDistance <= 20) {
            System.out.println("Дней требуется для доставки - " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <=60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Дней требуется для доставки - " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Дней требуется для доставки - " + deliveryDays);
        } else System.out.println("Свыше 100 км доставки нет");

    }
    public static void task5() {
        System.out.println("Задача 5:");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь, зима");
                break;
            case 2:
                System.out.println("Февраль, зима");
                break;
            case 3:
                System.out.println("Март, весна");
                break;
            case 4:
                System.out.println("Апрель, весна");
                break;
            case 5:
                System.out.println("Май, весна");
                break;
            case 6:
                System.out.println("Июнь, лето");
                break;
            case 7:
                System.out.println("Июль, лето");
                break;
            case 8:
                System.out.println("Август, лето");
                break;
            case 9:
                System.out.println("Сентябрь, осень");
                break;
            case 10:
                System.out.println("Октябрь, осень");
                break;
            case 11:
                System.out.println("Ноябрь, осень");
                break;
            case 12:
                System.out.println("Декабрь, зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}