public class Main {
    public static void main(String[] args) {
        tsak1();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void tsak1() {
        System.out.println("Task 1.");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr
             ) {
            sum += element;
        }
        System.out.println(sum);
    }
}