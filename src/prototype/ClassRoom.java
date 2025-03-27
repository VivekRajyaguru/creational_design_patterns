package prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClassRoom implements Cloneable {

    private List<String> students;

    public ClassRoom(List<String> students) {
        Objects.nonNull(students);
        this.students = new ArrayList<>(students);
    }

    public void addStudent(String name) {
        this.students.add(name);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "students=" + students +
                '}';
    }


    @Override
    public ClassRoom clone() {
        List<String> tempList = new ArrayList<>();
        this.students.forEach(student -> tempList.add(student));
        return new ClassRoom(students);
    }
}
