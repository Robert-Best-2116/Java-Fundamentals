import java.util.HashMap;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("eeyore", "I am the great big mouth Good riddance, though I'm sad to say");
        trackList.put("duality", "I push my fingers into my eyes");
        trackList.put("wait and bleed", "I felt the hate rise up in me");
        trackList.put("the heretic anthem", "if your 555 im 666");
        // get the keys by using the keySet method
        String title = trackList.get("eeyore");
        System.out.println(title);
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}