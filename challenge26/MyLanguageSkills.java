package challenge26;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class MyLanguageSkills {

    public static Set<String> getSkills(Map<String, Integer> skills) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String,Integer> entry : skills.entrySet()) {
            if (entry.getValue() >= 60)
                result.add(entry.getKey());
        }

        return  result;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> skills =new HashMap<>();
        skills.put("Java", 85);
        skills.put("C++", 30);
        skills.put("Ruby", 40);
        skills.put("Go", 90);

        System.out.println(getSkills(skills));
    }
}
