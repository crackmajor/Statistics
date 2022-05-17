package ru.netology.stats;

public class StatsService {
    public static long TotalOfAllSales(long[] sales) { //Сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static long AverageSalesPerMonth(long[] sales) { //Средняя сумма продаж в месяц
        long averageSum = 0;
        for (long sale : sales) {
            averageSum += sale;
        }
        averageSum = averageSum / 12;
        return averageSum;
    }

    public static long peakSalesMonth(long[] sales) { //Номер месяца, в котором был пик продаж
        int salesMax = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[salesMax]) {
                salesMax = month;
            }
            month = month + 1;
        }
        return salesMax + 1;
    }

    public static long minimumSalesMonth(long[] sales) { //Номер месяца, в котором был минимум продаж
        int salesMin = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[salesMin]) {
                salesMin = month;
            }
            month = month + 1;
        }
        return salesMin + 1;
    }

    public static long belowTheAverage(long[] sales) {//Кол-во месяцев, в которых продажи были ниже среднего
        long averageSum = StatsService.AverageSalesPerMonth(sales);
        int lowsalesnumber = 0;
        for (long sale : sales) {
            if (averageSum > sale) {
                lowsalesnumber = lowsalesnumber + 1;
            }
        }
        return lowsalesnumber;
    }

    public static long aboveTheAverage(long[] sales) {//Кол-во месяцев, в которых продажи были выше среднего
        long averageSum = StatsService.AverageSalesPerMonth(sales);
        int highsalesnumber = 0;
        for (long sale : sales) {
            if (averageSum < sale) {
                highsalesnumber = highsalesnumber + 1;
            }
        }
        return highsalesnumber;
    }
}
