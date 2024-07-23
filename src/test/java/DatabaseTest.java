import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DatabaseTest {

    private Database database;

    @Before
    public void setUp() {
        // ������� ��������� ���� ������ ����� ������ ������
        database = new Database();
    }

    @Test
    public void testAvailableBunsSize() {
        // ���������, ��� � ���� ������ ���� 3 �������
        List<Bun> buns = database.availableBuns();
        assertEquals(3, buns.size());
    }

    @Test
    public void testAvailableIngredientsSize() {
        // ���������, ��� � ���� ������ ���� 6 ������������
        List<Ingredient> ingredients = database.availableIngredients();
        assertEquals(6, ingredients.size());
    }

    @Test
    public void testFirstBunName() {
        // ���������, ��� ������ ������� � ������ ����� ��� "black bun"
        List<Bun> buns = database.availableBuns();
        assertEquals("black bun", buns.get(0).getName());
    }

    @Test
    public void testSecondIngredientType() {
        // ���������, ��� ������ ���������� � ������ ����� ��� SAUCE
        List<Ingredient> ingredients = database.availableIngredients();
        assertEquals(IngredientType.SAUCE, ingredients.get(1).getType());
    }

    @Test
    public void testIngredientPrice() {
        // ���������, ��� � ����������� � ������ "cutlet" ���� ����� 100
        List<Ingredient> ingredients = database.availableIngredients();
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getName().equals("cutlet")) {
                assertEquals(100, ingredient.getPrice(), 0.0);
                break;
            }
        }
    }

    @Test
    public void testAvailableBunsContainWhiteBun() {
        // ���������, ��� ����� ��������� ������� ���� ������� � ������ "white bun"
        List<Bun> buns = database.availableBuns();
        boolean containsWhiteBun = buns.stream().anyMatch(bun -> "white bun".equals(bun.getName()));
        assertTrue(containsWhiteBun);
    }

    @Test
    public void testAvailableIngredientsContainSourCream() {
        // ���������, ��� ����� ��������� ������������ ���� ���������� � ������ "sour cream"
        List<Ingredient> ingredients = database.availableIngredients();
        boolean containsSourCream = ingredients.stream().anyMatch(ingredient -> "sour cream".equals(ingredient.getName()));
        assertTrue(containsSourCream);
    }

    @Test
    public void testBunPrice() {
        // ���������, ��� ���� ������� � ������ "red bun" ����� 300
        List<Bun> buns = database.availableBuns();
        for (Bun bun : buns) {
            if (bun.getName().equals("red bun")) {
                assertEquals(300, bun.getPrice(), 0.0);
                break;
            }
        }
    }
}
