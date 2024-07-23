import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IngredientTypeTest {

    @Test
    public void testSauceType() {
        // ���������, ��� ��� SAUCE ����� ���������� ��������
        assertEquals(IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void testFillingType() {
        // ���������, ��� ��� FILLING ����� ���������� ��������
        assertEquals(IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }

    @Test
    public void testNumberOfTypes() {
        // ���������, ��� � ������������ IngredientType ����� 2 ��������
        assertEquals(2, IngredientType.values().length);
    }

    @Test
    public void testContainsSauce() {
        // ���������, ��� ������������ �������� ��� SAUCE
        boolean containsSauce = false;
        for (IngredientType type : IngredientType.values()) {
            if (type == IngredientType.SAUCE) {
                containsSauce = true;
                break;
            }
        }
        assertTrue(containsSauce);
    }

    @Test
    public void testContainsFilling() {
        // ���������, ��� ������������ �������� ��� FILLING
        boolean containsFilling = false;
        for (IngredientType type : IngredientType.values()) {
            if (type == IngredientType.FILLING) {
                containsFilling = true;
                break;
            }
        }
        assertTrue(containsFilling);
    }
}
