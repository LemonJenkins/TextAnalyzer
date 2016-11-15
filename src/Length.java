import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Length implements Command {
    @Override
    public void execute(ArrayList<String> listVords) {
        Map<String, Integer> frequency = new HashMap<>();
        for (String listVord : listVords) {
            if (!frequency.containsKey(listVord)) {
                char[] wordChar = listVord.toCharArray();
                frequency.put(listVord, wordChar.length);
            } else {
                frequency.put(listVord, (frequency.get(listVord + 1)));
            }
        }
        Set<String> keyFrequency = frequency.keySet();
        for (String k : keyFrequency) {
            System.out.println(k + " - " + frequency.get(k));
        }
    }
}
