package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    @Test
    public void getPrice() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE,"Сырный", 20);
        float actual = ingredient.getPrice();
        float expected = 20;
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getName() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"Сыр", 25);
        String actual = ingredient.getName();
        String expected = "Сыр";
        assertEquals(expected, actual);
    }

    @Test
    public void getType() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE,"Кетчуп", 15);
        IngredientType actual = ingredient.getType();
        IngredientType expected = IngredientType.SAUCE;
        assertEquals(expected, actual);
    }
}