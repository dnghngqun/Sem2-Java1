package labguide5;
import java.util.*;

public class PlanetDiameters {
    //array of planets’ name
    private static final String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };

    //Array of planets’ diameter
    private static final float[] diameters = { 4800f, 12103.6f, 12756.3f, 6794f, 142984f, 120536f, 51118f, 49532f, 2274f };

    public static void main(String[] args) {
        //Use Map to store planets’ names and their corresponding
        //diameters.
        Map planets = new TreeMap();

        // Add items (key , value) to the map
        for (int i = 0; i < names.length; i++)
            //lưu từng phần tử, giá trị vào map planets
            planets.put(names[i], diameters[i]);

        // Traverse the map
        //Iterator là một giao diện (interface) thuộc gói java.util.
        //Nó được sử dụng để lặp qua các phần tử của một cấu trúc dữ liệu, chẳng hạn như một danh sách (List),
        //một tập hợp (Set), hoặc một bản đồ (Map), mà không cần biết cấu trúc bên trong của cấu trúc dữ liệu đó.
        //entrySet(): Phương thức này trả về một tập hợp (Set) chứa tất cả các cặp key-value trong
        //iterator(): Phương thức này trả về một Iterator cho tập hợp các cặp key-value.
        Iterator it = planets.entrySet().iterator();

        //it.hasNext(): Phương thức này kiểm tra xem có phần tử tiếp theo trong Iterator không.
        //Map.Entry, đại diện cho mỗi cặp key-value trong Map
        //it.next() trả về phần tử tiếp theo trong Iterator
        //e.getKey(): Phương thức này trả về key của cặp key-value hiện tại trong Map.Entry.
        //e.getValue(): Phương thức này trả về value của cặp key-value hiện tại trong Map.Entry.
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            System.out.println(e.getKey() + ": " + e.getValue());
        }
        System.out.println("--------------------");

        // Find a planet by name basing on key
        while (true) {
            System.out.print("Find planet (ENTER to quit): ");
            String name = (new Scanner(System.in)).nextLine();
            if (name.length() == 0) break;
            //containsKey(name): Phương thức này được gọi trên Map (planets),
            // với tham số là name. Nó kiểm tra xem Map có chứa một key nào đó
            // (trong trường hợp này là name)
            if (!planets.containsKey(name))
                System.out.println("Planet " + name + " not found!");
            else
                System.out.println("The diameter of " + name +
                        " is " + planets.get(name));
        }
    }
}
