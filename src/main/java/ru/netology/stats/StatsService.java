package ru.netology.stats;

public class StatsService {

    public int salesAmount(long[] sales) {
        int monthAmount = 0;
        for (long sale : sales) {
            monthAmount += sale;
        }
        return monthAmount;
    }


    public double averageAmountOfAllSales(long[] sales) {

        int monthAmount = salesAmount(sales);
        return (monthAmount / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThenAverage(long[] sales) {
        int lessAmount = 0;
        double averageAmount = averageAmountOfAllSales(sales);

        for (long sale : sales) {

            if (sale < averageAmount) {
                lessAmount++;
            }

        }
        return lessAmount;
    }

    public int overThenAverage(long[] sales) {
        int OverAmount = 0;
        double averageAmount = averageAmountOfAllSales(sales);

        for (long sale : sales) {

            if (sale > averageAmount) {
                OverAmount++;
            }

        }
        return OverAmount;
    }

}
