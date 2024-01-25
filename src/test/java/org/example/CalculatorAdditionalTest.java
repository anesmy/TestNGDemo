package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class CalculatorAdditionalTest {

    @BeforeGroups(groups = "groupName")
    public void beforeYourGroup() {
        System.out.println("before test1");
    }

    @Test
    public void testMultiplyNumbers() {
        Assert.assertEquals(Calculator.multiplyNumbers(100, 200), 20000);
        Assert.assertEquals(Calculator.multiplyNumbers(1000000, 0), 0);
        Assert.assertTrue((0 == Calculator.multiplyNumbers(0, 200120)));
    }

    @Test
    public void testGetQuotientByDividingNumbers() {
        Assert.assertEquals(Calculator.getQuotientByDividingNumbers(500, 200), 2);
        Assert.assertEquals(Calculator.getQuotientByDividingNumbers(-100, -100), 1);
        Assert.assertNotEquals(false, (2 == Calculator.getQuotientByDividingNumbers(500,200)));
        Assert.assertNotEquals(Calculator.getQuotientByDividingNumbers(500, 200), 3, "Quotient calculated result is wrong");
    }

    @Test
    public void testGetReminderByDividingNumbers() {
        Assert.assertNotEquals(Calculator.getReminderByDividingNumbers(500, 200), 1);
        Assert.assertEquals(Calculator.getReminderByDividingNumbers(-100, -100), 0);
        Assert.assertNotEquals(true, (2 == Calculator.getReminderByDividingNumbers(-100,-100)));
        Assert.assertNotEquals(Calculator.getReminderByDividingNumbers(500, 200), 3, "Reminder calculated result is wrong");
    }
}
