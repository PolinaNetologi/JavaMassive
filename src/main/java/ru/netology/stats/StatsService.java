package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sumSale = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSale = sumSale + sales[i];
        }
        return sumSale;
    }

    public int average(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxMonthSale(int[] sales) {
        int maxMoth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMoth]) {
                maxMoth = i;
            }
        }
        return maxMoth + 1;
    }

    public int minMonthSale(int[] sales) {
        int minMoth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMoth]) {
                minMoth = i;
            }
        }
        return minMoth + 1;
    }

    public int mothBellowAverage(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int mothNellAverage(int[] sales) {
        int counter = 0;
        for (int sale : sales) {
            if (sale <= average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}








