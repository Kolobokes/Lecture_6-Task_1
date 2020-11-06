package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    long[] salesAmountByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateTotalAmount() {
        StatsService service  = new StatsService();

        long actual = service.calculateTotalAmount(salesAmountByMonth);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageAmount() {
        StatsService service  = new StatsService();

        long actual = service.calculateAverageAmount(salesAmountByMonth);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void findMonthMaxAmount() {
        StatsService service  = new StatsService();

        long actual = service.findMonthMaxAmount(salesAmountByMonth);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void findMonthMinAmount() {
        StatsService service  = new StatsService();

        long actual = service.findMonthMinAmount(salesAmountByMonth);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void belowAverageSalesMonth() {
        StatsService service  = new StatsService();

        long actual = service.belowAverageSalesMonth(salesAmountByMonth);
        long expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void montOfSalesAboveAverage() {
        StatsService service  = new StatsService();

        long actual = service.montOfSalesAboveAverage(salesAmountByMonth);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
