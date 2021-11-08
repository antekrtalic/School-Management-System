package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melisa = new Teacher(2, "Melisa", 700);
        Teacher vanderhon = new Teacher(3, "Vanderhon", 450);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(vanderhon);
    }
}
