package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

//duy trì thứ tự chèn, chứa phần tử không trùng nhau
//cho phép pt null
public class LinkedHashSetExample {
    public static void LinkedHashSetDemo(){

        //khai báo LinkedHashSet
        LinkedHashSet<String>  st = new LinkedHashSet<>();
        //add() method to add element
        st.add("Java");
        st.add("C#");
        st.add("HTML");
        st.add("Python");
        st.add("ASP.NET");
        st.add("ASP.NET");
        System.out.println("LinkedHashSet: " + st);

        //check exits
        System.out.println("Check exits: " + st.contains("Java"));

        //iterator: dùng để lặp thông qua 1 LinkedHashSet
        Iterator iterator = st.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        LinkedHashSetDemo();
    }
}
