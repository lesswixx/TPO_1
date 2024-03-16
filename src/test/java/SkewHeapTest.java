import static org.junit.Assert.assertEquals;
import org.junit.Test;
import task2.SkewHeap;

public class SkewHeapTest {
    @Test
    public void testHeapOperations() {
        // Создание новой SkewHeap
        SkewHeap heap = new SkewHeap();

        // Вставка элементов в кучу и проверка, что минимальный элемент удаляется правильно
        heap.insert(4);
        heap.insert(2);
        heap.insert(6);
        assertEquals(2, heap.removeMin()); // Проверка, что наименьший элемент (2) удаляется первым
        assertEquals(4, heap.removeMin()); // Затем следует элемент 4
        assertEquals(6, heap.removeMin()); // И наконец элемент 6

        // Создание двух отдельных куч для проверки операции слияния
        SkewHeap heap1 = new SkewHeap();
        SkewHeap heap2 = new SkewHeap();

        // Вставка элементов в обе кучи
        heap1.insert(1);
        heap1.insert(3);
        heap2.insert(2);
        heap2.insert(4);

        // Слияние двух куч и проверка, что элементы удаляются в правильном порядке
        heap1.merge(heap2);
        assertEquals(1, heap1.removeMin()); // Первым удаляется наименьший элемент из объединенной кучи (1)
        assertEquals(2, heap1.removeMin()); // Затем следует 2
        assertEquals(3, heap1.removeMin()); // После - 3
        assertEquals(4, heap1.removeMin()); // И последним - 4
    }
}
