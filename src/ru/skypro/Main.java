package ru.skypro;

public class Main {

    public static void main(String[] args) {

        // Задание 1
        int currentNum = 0;

        while (currentNum < 10) {
            System.out.print(++currentNum + " ");
        }

            System.out.println();

        for (; currentNum > 0; currentNum--) {
            System.out.print(currentNum + " ");
        }

        // Задание 2
            System.out.println();
        int fierstFriday = 1;
        for (int currentFriday = fierstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + " -е число. Необходимо подготовить отчет.");
        }

        // Задание 3
        System.out.println();
        int year = 2022;
        int yearStart = year - 200;
        int yearFinish = year + 100;
        for (int y = yearStart; y <= yearFinish; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }


    }


}
