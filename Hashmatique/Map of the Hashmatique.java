import java.util.HashMap;
import java.util.Set;

public class TestHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Song1", "Lyrics1");
        trackList.put("Song2", "Lyrics2");
        trackList.put("Song3", "Lyrics3");
        trackList.put("Song4", "Lyrics4");
        

        // Pull out one of the songs by its track title
        System.out.println(trackList.get("Song1"));


        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }
    }
}