package crm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTitleTest {

    @Test
    public void testPageTitleShouldBeCorrect() {
        // Это пример теста. Мы просто проверяем простое условие.
        String expectedTitle = "My Awesome Page";
        String actualTitle = "My Awesome Page"; // Здесь мы "имитируем" получение заголовка

        assertEquals(expectedTitle, actualTitle, "The page title should be correct");
        System.out.println("Simple title test passed!");
    }
}