package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int a = 0;
        while (a < 10) {
            System.out.print(++a + " ");
        }
            System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }

        // Задание 2
            System.out.println();
        for (int day = 1; day <= 31; day= day+7) {
            System.out.println("Сегодня пятница, " + day + " число. Необходимо подготовить отчет");
        }

        // Задание 3
        System.out.println();
        int year = 2022;
        int yearStart = year - 200;
        int yearFinish = year + 100;
        for (int y = yearStart; y <= yearFinish; y += 1) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }


    }


}
