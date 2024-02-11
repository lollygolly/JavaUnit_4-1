package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldShowRemainderWhenAmountBeforeBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemainderWhenAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemainderWhenAmountAfterBoundary() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1200);
        Assertions.assertEquals(expected, actual);
    }
}
