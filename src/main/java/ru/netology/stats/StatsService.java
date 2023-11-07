package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;

            //for (int i = 0; i < sales.length; i++) { более гибкий метод
            //totalSale += sales[i];
            //}
        }
        return totalSale;
    }

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;

    }

    public int monthMax(long[] sales) {
        int monthMaxSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaxSale]) {
                monthMaxSale = i;
            }
        }
        return monthMaxSale + 1;
    }

    public int monthMin(long[] sales) {
        int monthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSale]) {
                monthMinSale = i;
            }
        }
        return monthMinSale + 1;
    }

    public int monthBelowAverage(long[] sales) {
        int monthBelow = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                monthBelow++;
            }
        }
        return monthBelow;

    }

    public int monthAboveAverage(long[] sales) {
        int monthAbove = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                monthAbove++;
            }
        }
        return monthAbove;
    }
}


