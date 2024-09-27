package lab0;
import java.time.YearMonth;

public class Variant4 {
    //  integer
    public static int task1(int A, int B) {
        if (A <= 0 || B <= 0 || A < B) {
            return 0;
        }

        return A / B;
    }


    //  boolean
    public boolean task2(int A, int B) {
        return (A > 2) && (B < 3);
    }

    //  if
    public int task3(int a, int b, int c) {
        int count = 0;
        if (a > 0) count++;
        if (b > 0) count++;
        if (c > 0) count++;
        return count;
    }


    //  case
    public static int task4(int month) {
        // Перевіряємо, чи місяць знаходиться в діапазоні від 1 до 12
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }

        // Отримуємо кількість днів у місяці для невисокосного року
        YearMonth yearMonth = YearMonth.of(2023, month);
        return yearMonth.lengthOfMonth();
    }

    //  for
    public double[] task5(double pricePerKg) {
        double[] weights = {1, 2, 10};  // Різні ваги, для яких потрібно обчислити вартість
        double[] costs = new double[weights.length];

        // Цикл для обчислення вартості для кожної ваги
        for (int i = 0; i < weights.length; i++) {
            costs[i] = pricePerKg * weights[i];
        }

        return costs;
    }

    //  while
    public boolean task6(int N) {
        if (N <= 0) {
            return false;
        }

        while (N % 3 == 0) {
            N /= 3;
        }

        return N == 1;
    }

    //  array
    public int[] task7(int N, int A, int D) {
        if (N < 1) {
            throw new IllegalArgumentException("N must be greater than or equal to 1");
        }

        int[] progression = new int[N];
        progression[0] = A;

        for (int i = 1; i < N; i++) {
            progression[i] = progression[i - 1] * D;
        }

        return progression;
    }

    //  matrix
    public int[][] task8(int M, int N, int[] numbers) {
        if (M <= 0 || N <= 0 || numbers == null || numbers.length != N) {
            throw new IllegalArgumentException("Invalid input");
        }

        int[][] matrix = new int[M][N];

        // Заповнюємо кожен рядок матриці значеннями з масиву numbers
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = numbers[j];
            }
        }

        return matrix;
    }
}
