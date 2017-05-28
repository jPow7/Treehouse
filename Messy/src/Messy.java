import java.util.Arrays;
import java.util.List;

public class Messy {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Bacon", "Eggs", "Cheese", "hot sauce");
        words.forEach(s -> System.out.printf("I want %s %n", s));
    }
}
