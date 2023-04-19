package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSumSale() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.sum(sales);
        int expectedSum = 180;
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.average(sales);
        int expectedSum = 180 / 12;
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void testMaxMoth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.maxMonthSale(sales);
        int expectedSum = 8;
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void testMinMoth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.minMonthSale(sales);
        int expectedSum = 9;
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void testMothBellowAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.mothBellowAverage(sales);
        int expectedSum = 5;
        Assertions.assertEquals(expectedSum, actual);
    }

    @Test
    public void testMothNellAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 18, 14};

        int actual = service.mothNellAverage(sales);
        int expectedSum = 7;
        Assertions.assertEquals(expectedSum, actual);
    }
}


