package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldShowAmountForCashBack() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(600);
        Assert.assertEquals(actual, expected);
    }
}
