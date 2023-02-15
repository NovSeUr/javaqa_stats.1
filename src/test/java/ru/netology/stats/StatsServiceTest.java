package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {

    @Test
    public void salesAmount(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.salesAmount(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void averageAmount(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        double actual = service.averageAmountOfAllSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void maxSales(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void minSales(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void lessThenAverage(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.lessThenAverage(sales);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void overThenAverage(){
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.overThenAverage(sales);

        Assertions.assertEquals(expected,actual);
    }

}