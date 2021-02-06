package ru.netology.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainIfSmall() {
    CashbackHackService cashback=new CashbackHackService();
    int actual=cashback.remain(2500);
    int expected=500;
    assertEquals(actual, expected);
    }

    @Test
    public void shouldTestRemainIfBig() {
        CashbackHackService cashback=new CashbackHackService();
        int actual=cashback.remain(2_190_1111);
        int expected=889;
        assertEquals(actual, expected);
    }

}
