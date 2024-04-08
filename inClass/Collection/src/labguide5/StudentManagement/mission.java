package labguide5.StudentManagement;

import java.io.IOException;
import java.util.ArrayList;

public interface mission {
    abstract void addStudent(ArrayList<Student> list);

    abstract void updateStudent(ArrayList<Student> list);
    abstract void deleteStudent(ArrayList<Student>list);
    abstract void show(ArrayList<Student> list);
    abstract void Search(ArrayList<Student> list);

    abstract void saveFile(ArrayList<Student> list) throws IOException;
    abstract void loadFile() throws IOException;
}
