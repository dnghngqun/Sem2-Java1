package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    //sortedSet: sắp xếp tăng dần không trùng nhau
    public static void sortedSetDemo(){
        //khai báo sortedSet
        SortedSet<String>  st = new TreeSet<>();
        //add() method to add element
        st.add("Vinh");
        st.add("Hoa");
        st.add("Hai");
        st.add("Anh");
        st.add("Hung");
        st.add("Mai");

        System.out.println("SortedSet: " + st);

        //removing the element
        st.remove("Hai");
        st.add("Mai");

        System.out.println("After remove and add: " + st);
    }

    public static void main(String[] args) {
        sortedSetDemo();
    }
}

