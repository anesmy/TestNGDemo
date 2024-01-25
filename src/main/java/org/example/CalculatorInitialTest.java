package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

@Ignore
public class CalculatorInitialTest {

    String person;

    @BeforeTest
    public void beforeTest() {
        person = "mentor";
    }

    @Test(testName = "Parameters test")
    @Parameters({ "language", "mentor" })
    public void testEasySamples(String language, String mentor) {
        Assert.assertTrue(language.contains("Java"));
        Assert.assertTrue(mentor.contains("Serhii"));
        Assert.assertTrue(person.contains("mentor"));
        Assert.assertEquals(20000, (1000 * 20));
        Assert.assertTrue((1000 * 20) >= 2000);
        Assert.assertTrue(person.contains("mentor"));
        Assert.assertTrue(language.contains("Java"));
        Assert.assertTrue(mentor.contains("Serhii"));
    }

    @Test(enabled = false)
    public void testAddNumbers() {
        Assert.assertEquals(Calculator.addNumbers(100, 200), 300);
        Assert.assertEquals(Calculator.addNumbers(-100, 100), 0);
        Assert.assertEquals(true, 0 == Calculator.addNumbers(-100,100));
    }

    @Test(groups = "groupName")
    public void testSubtractNumbers() {
        Assert.assertEquals(Calculator.subtractNumbers(500, 200), 300);
        Assert.assertEquals(Calculator.addNumbers(-100, -100), -200);
        Assert.assertNotEquals(true, (200 == Calculator.addNumbers(-100,-100)));
        Assert.assertNotEquals(Calculator.subtractNumbers(500, 200), 3000, "Subtracted result is wrong");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("End of the test");
    }
}
