package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainIfSmall() {
    CashbackHackService cashback=new CashbackHackService();
    int actual=cashback.remain(2500);
    int expected=500;
    assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIf1000() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(1000);
        int expected=0;
        assertEquals(actual, expected);
    }

}
