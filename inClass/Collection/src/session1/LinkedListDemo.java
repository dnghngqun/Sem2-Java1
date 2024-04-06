package session1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void demoLinkList(){
    //khởi tạo LinkedList
    LinkedList<String> student = new LinkedList<>();
    List<String> student1 = new LinkedList<>();

    //về cơ bản thì nó tương đương các phương thức trong arrayList
    //add..., set...., get...

    student.add("Huy");
    student.add("Hai");
    student.add("Huong");
    student.add("Hang");
    student.add("Hung");
    show(student);
    //poll(): trả về phần tử đầu tiên và xóa khỏi ds
    student.poll();
    show(student);

    //pollLast(): trả về phần tử cuối và xóa khỏi ds
    student.pollLast();
    show(student);

}

public static void show(LinkedList list){
    for(Object item : list){
        System.out.println(item);
    }
}

    public static void main(String[] args) {
        demoLinkList();
    }
}
