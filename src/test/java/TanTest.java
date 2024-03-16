import static org.junit.Assert.*;
import org.junit.Test;
import task1.Tan;

public class TanTest {
    // Допуск для сравнения вещественных чисел
    private static final double DELTA = 0.01;

    @Test
    public void testTanApproxAtZero() {
        // Тестирование приближения тангенса в точке 0.
        // Ожидаемое значение тангенса в точке 0 равно 0.
        assertEquals(0.0, Tan.tanApprox(0), DELTA);
    }

    @Test
    public void testTanApproxAtPiDiv4() {
        // Тестирование приближения тангенса в точке π/4.
        // Ожидаемое значение тангенса в точке π/4 равно 1.
        assertEquals(1.0, Tan.tanApprox(Math.PI / 4), DELTA);
    }

    @Test
    public void testTanApproxAtMinusPiDiv4() {
        // Тестирование приближения тангенса в точке -π/4.
        // Ожидаемое значение тангенса в точке -π/4 равно -1.
        assertEquals(-1.0, Tan.tanApprox(-Math.PI / 4), DELTA);
    }

    @Test
    public void testTanApproxCloseToPiDiv2() {
        // Тестирование приближения тангенса в точке близкой к π/2.
        // Так как тангенс стремится к бесконечности около π/2,
        // мы ожидаем, что приближенное значение будет очень большим.
        // Тест проверяет, что результат функции превышает некоторый большой порог.
        double x = Math.PI / 2 - 0.01;
        assertTrue(Math.abs(Tan.tanApprox(x)) > 5);
    }
}
