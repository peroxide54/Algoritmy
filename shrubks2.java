import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "abc abc ab abc ab acs acs";
        System.out.println("Исходная строка: " + input);

        String result = removeDuplicates(input);
        System.out.println("Результат: " + result);
    }

    public static String removeDuplicates(String input) {
        String[] words = input.split("\\s+"); // Разделяем по пробелам
        Set<String> seen = new LinkedHashSet<>(Arrays.asList(words)); // Сохраняем порядок, убираем повторы
        return String.join(" ", seen);
    }
}
