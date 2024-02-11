package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {
    @Test
    public void shouldShowAmountForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(600);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainderWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainderWhenAmountAfterBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1200);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowAmountForCashBackForJunit5() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowAmountForCashBackForJunit5WhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }
}
