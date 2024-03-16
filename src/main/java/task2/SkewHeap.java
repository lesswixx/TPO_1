package task2;

import java.util.NoSuchElementException;

public class SkewHeap {
    private SkewNode root;

    public SkewHeap() {
        root = null;
    }

    private SkewNode merge(SkewNode x, SkewNode y) {
        if (x == null) return y;
        if (y == null) return x;

        if (x.value > y.value) {
            SkewNode temp = x;
            x = y;
            y = temp;
        }

        // Слияние y с правым поддеревом x
        SkewNode temp = merge(x.right, y);
        x.right = x.left;
        x.left = temp;
        return x;
    }

    public void insert(int value) {
        SkewNode node = new SkewNode(value);
        root = merge(root, node);
    }

    public int removeMin() {
        if (root == null) throw new NoSuchElementException("Heap is empty.");

        int minValue = root.value;
        root = merge(root.left, root.right);
        return minValue;
    }

    // Метод для объединения двух Skew Heaps
    public void merge(SkewHeap other) {
        root = merge(root, other.root);
    }

    // Дополнительные методы, если необходимы
}