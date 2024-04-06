package labguide5;
import java.util.*;
public class LyricSet {
    private static final String[] lyric = {"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        // Create a set from HashSet that’s implemented Set
        Set words = new LinkedHashSet();
        // Add all words to set
        for (String w : lyric)
            words.add(w);
        //convert set to list
        List<String> list = new ArrayList<>(words);
        //get index
        for (String item: list){
            int index = list.indexOf(item);
            System.out.println(item + ": " + index);
        }

        list.addAll(words);
        //use for-each loop
        // Traverse the list
        // NOTICE: set doesn't allow duplicate items
        for (Object o : words)
            System.out.print(o + " ");

        System.out.println("\n------------------");
        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
    }

    }
