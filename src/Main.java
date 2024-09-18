public class Main {
    // Метод к заданию 1
    public static void printTheYear(int year) {
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if ((year > 1584 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");

        }
    }

    // Метод для задания 2
    public static void printVersion(int oS, int year) {
        if (oS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (oS == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    // Метод для задания 3
    public static void printDistanceTime(int km) {
        int day = 1;
        if (km > 0 && km <= 20) {
            System.out.println("Потребуется дней на доставку " + day);
        } else if (km > 20 && km <= 60) {
            System.out.println("Потребуется дней на доставку " + (day + 1));
        } else if (km > 60 && km <= 100) {
            System.out.println("Потребуется дней на доставку " + (day + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2024;
        printTheYear(year);

        System.out.println();
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2024;
        printVersion(clientOS, clientDeviceYear);

        System.out.println();
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        printDistanceTime(deliveryDistance);
    }
}
