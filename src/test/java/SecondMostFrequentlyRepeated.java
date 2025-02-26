import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;
public class SecondMostFrequentlyRepeated {

    public static Character  returnSecondMostFrequentlyRepeatedChar(String str){

        Map<Character, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Function.identity(), counting()));
        Optional<Map.Entry<Character, Long>> first = collect.entrySet().stream().sorted((o1, o2) -> (int) (o1.getValue() - o2.getValue())).skip(1).findFirst();
        return first.get().getKey();
    }

    public static void main(String[] args) {
        System.out.println(returnSecondMostFrequentlyRepeatedChar("sdfsdfasdfsdfv"));


    }
}
