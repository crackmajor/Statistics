import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void TotalOfAllSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long actual = service.TotalOfAllSales(sales);
        long expected = 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesPerMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long actual = service.AverageSalesPerMonth(sales);
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void peakSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 999999, 2};
        long actual = service.peakSalesMonth(sales);
        long expected = 11;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimumSalesMonthTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 999999, 2};
        long actual = service.minimumSalesMonth(sales);
        long expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowTheAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 999999, 2};
        long actual = service.belowTheAverage(sales);
        long expected = 11;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveTheAverageTest() {
        StatsService service = new StatsService();
        long[] sales = {1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 999999, 2};
        long actual = service.aboveTheAverage(sales);
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
