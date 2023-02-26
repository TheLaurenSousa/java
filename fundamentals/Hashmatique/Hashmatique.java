import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main (String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        
        trackList.put("Homesick", "Everything around me seems so much different than where I'm from");
        trackList.put("If it means a lot to you", "And hey, darling, I hope you're good tonight");
        trackList.put("Have faith in me", "Have faith in me, 'cause there are things that I've seen I don't believe");
        trackList.put("I'm made of wax Larry, What are you made of?", "Don't blink, they won't even miss you at all");
        
        String song = trackList.get("I'm made of wax Larry, What are you made of?");
        System.out.println(song);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}