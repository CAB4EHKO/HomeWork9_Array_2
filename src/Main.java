import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Task 1.");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr
             ) {
            sum += element;
        }
        System.out.println(sum);
    }
    public static void task2() {
        System.out.println("Task 2.");
        int[] arr = generateRandomArray();
        int maxCost = arr[0];
        int minCost = arr[0];
            for (final int current : arr) {
             if (current > maxCost) {
                 maxCost = current;
             }
        }
        for (final int current : arr) {
            if (current < minCost) {
                minCost = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minCost + " рублей." + "\nМаксимальная сумма трат за день составила: " + maxCost + " рублей.");
    }
}