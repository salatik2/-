public class Main {
    public static void main(String[] args) {
        // Инициализация массива целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Переменные для хранения суммы и среднего арифметического
        int sum = 0;
        double average;

        // Вычисление суммы элементов массива
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Вычисление среднего арифметического
        average = (double) sum / numbers.length;

        // Вывод результатов на экран
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}