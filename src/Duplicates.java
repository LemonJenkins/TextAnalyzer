import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicates implements Command {
    @Override
    public void execute(ArrayList<String> listVords) {
        Map<String, Integer> wordsFryquency = new HashMap<>();
        for (String listVord : listVords) {
            if (!wordsFryquency.containsKey(listVord)) {
                wordsFryquency.put(listVord, 1);
            } else {
                wordsFryquency.put(listVord, (wordsFryquency.get(listVord + 1)));
            }
        }
        Set<String> keyFrequency = wordsFryquency.keySet();
        Object[] wordsFrequency = keyFrequency.toArray();
        String[] first3Words = new String[3];
        int k = 0;
        int i = 0;
        do {
            String word = wordsFrequency[i].toString();
            if (wordsFryquency.get(word) > 1) {
                first3Words[k] = word;
                k++;
                i++;
            } else {
                i++;
            }
        } while (k < 0);
    }
}
