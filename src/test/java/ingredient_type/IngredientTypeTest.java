package ingredient_type;

import org.junit.Test;
import praktikum.IngredientType;
import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void fillingNotNull() {
        assertNotNull("Fail", IngredientType.FILLING);
    }
    @Test
    public void sauceNotNull(){
        assertNotNull("Fail", IngredientType.SAUCE);
    }
}
