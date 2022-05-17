import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {88, 2, 3, 4, 5, 6, 50, 8, 88, 10, 11, 12};

        long sum = StatsService.TotalOfAllSales(sales);
        System.out.println(sum);

        long averageSum = StatsService.AverageSalesPerMonth(sales);
        System.out.println(averageSum);

        long salesMax = StatsService.peakSalesMonth(sales);
        System.out.println(salesMax);

        long salesMin = StatsService.minimumSalesMonth(sales);
        System.out.println(salesMin);

        long belowTheAverage = StatsService.belowTheAverage(sales);
        System.out.println(belowTheAverage);

        long aboveTheAverage = StatsService.aboveTheAverage(sales);
        System.out.println(aboveTheAverage);
    }
}
