import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "56 65 74 100 99 68 86 180 90";
        System.out.println("Исходная строка: " + input);

        String result = sortByDigitSum(input);
        System.out.println("Отсортированный список: " + result);
    }

    public static String sortByDigitSum(String input) {
        String[] weights = input.split(" ");
        Arrays.sort(weights, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);
            if (sumA == sumB) {
                return a.compareTo(b);
            }
            return Integer.compare(sumA, sumB);
        });
        return String.join(" ", weights);
    }

    private static int digitSum(String numStr) {
        int sum = 0;
        for (char c : numStr.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
