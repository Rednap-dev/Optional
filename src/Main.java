import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 11, 15, 10, 5);
        List<Integer> result = list.stream()
                .distinct()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
        Optional<Integer> resultO = result.stream().reduce((x, y) -> x + y);
        System.out.println(resultO.get());
    }
}
