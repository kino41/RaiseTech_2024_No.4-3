import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("grape", "peach", "apple", "banana", "orange");
        List<String> sortedResult = names.stream().sorted().toList();
        System.out.println(sortedResult);

        List<String> result = names.stream()
                .filter(name -> name.contains("p"))
                .filter(name -> name.startsWith("a"))
                .toList();
        System.out.println("pを含み、aから始まる果物は" + result);
    }
}
