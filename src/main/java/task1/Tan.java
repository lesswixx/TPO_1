package task1;

public class Tan {
    public static double tanApprox(double x) {
        // Преобразование радиан в диапазон [-π, π]
        x = x % (Math.PI * 2);
        if (x > Math.PI) {
            x -= Math.PI * 2;
        } else if (x < -Math.PI) {
            x += Math.PI * 2;
        }

        // Разложение тангенса в ряд Тейлора до 9-го порядка
        return x + (Math.pow(x, 3) / 3) + (2 * Math.pow(x, 5) / 15) +
                (17 * Math.pow(x, 7) / 315) + (62 * Math.pow(x, 9) / 2835);
    }
}
