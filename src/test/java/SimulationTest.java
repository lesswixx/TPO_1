import static org.junit.Assert.*;

import org.junit.Test;
import task3.Arthur;
import task3.Camera;
import task3.Console;

public class SimulationTest {
    @Test
    public void testArthurReactsToCamera() {
        // Создание экземпляра Артура
        Arthur arthur = new Arthur();
        // Моделирование реакции Артура на камеру
        arthur.reactToCamera();
        // Проверка, что ощущения Артура соответствуют ожидаемым после реакции на камеру
        assertEquals("Feels a breeze on his incorporeal head...", arthur.getFeeling());
    }

    @Test
    public void testArthurMovesToConsole() {
        // Создание экземпляра Артура
        Arthur arthur = new Arthur();
        // Моделирование действия Артура по перемещению к пульту
        arthur.moveToConsole();
        // Проверка, что после перемещения к пульту позиция Артура изменилась соответственно
        assertEquals(1, arthur.getPosition());
        // Также проверяем, что ощущения Артура обновляются соответствующим образом
        assertEquals("Moving towards the console...", arthur.getFeeling());
    }

    @Test
    public void testCameraTurnsOn() {
        // Создание экземпляра камеры
        Camera camera = new Camera();
        // Включение камеры
        camera.turnOn();
        // Проверка, что статус камеры изменился на "recording"
        assertEquals("recording", camera.getStatus());
    }

    @Test
    public void testConsoleActivates() {
        // Создание экземпляра пульта
        Console console = new Console();
        // Активация пульта
        console.activate();
        // Проверка, что статус пульта изменился на "active"
        assertEquals("active", console.getStatus());
    }
}
