package ru.netology.stats;
public class StatsService {
    //Первый метод:
    public int sumAll(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum = sum + i;
        }
        return sum;
    }

    //Второй метод:
    public int averageAmount(int[] sales) {
        return sumAll(sales) / sales.length;
    }

    //Третий метод
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //Четвертый метод
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Пятый метод
    public int aboveAverage(int[] sales) {
        int aboveMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount(sales)) {
                aboveMonth = aboveMonth + 1;
            }
        }
        return aboveMonth;
    }

    //Шестой метод
    public int belowAverage(int[] sales) {
        int belowMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > averageAmount(sales)) {
                belowMonth = belowMonth + 1;
            }
        }
        return belowMonth;
    }
}
