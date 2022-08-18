import java.util.Random;

public class Main {
    public static void main(String[] args) {generateRandomArrow();}

    public static int[] generateRandomArrow() {
        java.util.Random random = new java.util.Random();
        int arr[] = new int[30];
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            System.out.println("Сумма трат за месяц составила " + arr[i] + "рублей");
            System.out.println(sum);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Среднее арифметическое всех элементов: "+sum/ arr.length);


        }
        for (int i = 30; i >= arr.length; i--) {

            System.out.println(reverseFullName);

        }
        return arr;
    }
}