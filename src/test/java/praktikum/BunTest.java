package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {

    @Test
    public void getName() {
        Bun bun = new Bun("Булочка", 50);
        String actual = bun.getName();
        String expected = "Булочка";
        assertEquals(expected, actual);
    }

    @Test
    public void getPrice() {
        Bun bun = new Bun("Булочка", 50);
        float actual = bun.getPrice();
        float expected = 50;
        assertEquals(expected, actual, 0);
    }
}