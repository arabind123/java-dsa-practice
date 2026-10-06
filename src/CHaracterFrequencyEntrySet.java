import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CHaracterFrequencyEntrySet {
    static void main(String[] args) {
        String str="programming";
        Map<Character, Long> result=str.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        for(Map.Entry<Character, Long> entry :  result.entrySet())
        {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
