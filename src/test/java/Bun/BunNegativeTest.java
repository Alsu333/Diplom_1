package Bun;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

@RunWith(Parameterized.class)
public class BunNegativeTest {
    private final String name;
    private final float price;
    public BunNegativeTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters(name = "buns: {0},{1}")
    public static Object[] Data() {
        return new Object[][]{
                {" bun", 0},
                {"", -2000000},
                {null, -0},
        };
    }
    @Test
    public void BunNameTest() {
        Bun bun = new Bun(name, price);
        String actualName = bun.getName();
        String expectedName = name;
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void BunPriceTest(){
        Bun bun = new Bun(name, price);
        Float expectedPrice = price;
        Float actualPrice = bun.getPrice();
        Assert.assertEquals(expectedPrice, actualPrice);
    }
}
