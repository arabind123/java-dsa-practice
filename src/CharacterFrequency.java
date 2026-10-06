import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    static void main(String[] args) {
        String str="programming";
        Map<Character,Long> result= str.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c-> c,Collectors.counting()));
        System.out.println(result);



    }
}
