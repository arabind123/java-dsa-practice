import java.util.HashMap;

public class FirstNonRepeatingChar
{
    static void main(String[] args) {
        String str="swiss";
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for(int j=0; j<str.length(); j++)
            {
                char ch = str.charAt(j);
                if(map.get(ch)==1)
                {
                    System.out.println(ch);
                    return;
                }
            }

        }

    }

