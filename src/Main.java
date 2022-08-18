import java.util.Random;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();

        int arr[] = new int[30];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];

            System.out.println("Сумма трат за месяц составила " + arr[i] + " рублей");
            System.out.println(sum);

            int max = arr[0];
            int min = arr[0];

            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

        }
        System.out.println("Среднее арифметическое всех элементов: " + sum / arr.length);

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--)
            System.out.print(reverseFullName[i]);
    }

    int [] arr = generateRandomArrow();
    public static int[] generateRandomArrow() {

        java.util.Random random = new java.util.Random();
        int arr[] = new int[30];
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100_000) + 100_000;

        return arr;
    }
}
