import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> evenNumbers = new ArrayList<>();
        intList.stream()
                .filter(number -> number > 0 && number % 2 == 0)
                .forEach(evenNumbers::add);


        evenNumbers.sort(Comparator.naturalOrder());

        for (Integer number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}