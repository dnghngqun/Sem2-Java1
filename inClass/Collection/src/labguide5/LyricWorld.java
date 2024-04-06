package labguide5;
import  java.util.*;
public class LyricWorld {
    private static final String[] lyric ={"you", "say", "it", "best",
            "when", "you", "say", "nothing", "at", "all"};

    public static void main(String[] args) {
        // Create a list that’s implemented by ArrayList
        List<String> words = new ArrayList();
        // Add all String in string array to list
        //use for-each loop
        for (String w : lyric)
            words.add(w);

        words.add(Integer.toString(5));
        //use for-each loop
        // Traverse the list
        //trong Java, thường khuyến khích sử dụng lớp cơ sở nhất là Object
        // khi không có kiểu cụ thể nào được biết đến trước đó.
        // Điều này giúp tăng tính linh hoạt của mã, cho phép bạn duyệt qua bất kỳ kiểu dữ liệu nào.
        for (Object o : words)
            System.out.print(o + " ");
        System.out.println("\n------------------");

        System.out.println("Contains [you]?:" + words.contains("you"));
        System.out.println("Contains [me]?:" + words.contains("me"));
        System.out.println("Where's [say]?:" + words.indexOf("say"));
        System.out.println("Where's the last [say]?: " +       words.lastIndexOf("say"));

        //sort words follow alphabet
        Collections.sort(words);

        //show all elements of words
        //use for-each loop
        for (Object o : words) {
            System.out.print(o + " ");
        }
    }
}

