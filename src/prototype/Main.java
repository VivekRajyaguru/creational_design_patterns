package prototype;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(Arrays.asList("Vivek"));
        System.out.println(classRoom.hashCode());
        System.out.println(classRoom);

        ClassRoom classRoom1 = classRoom.clone();
        classRoom1.addStudent("Test");
        System.out.println(classRoom1.hashCode());
        System.out.println(classRoom1);
    }
}
