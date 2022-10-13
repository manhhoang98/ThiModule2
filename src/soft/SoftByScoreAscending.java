package soft;

import model.Student;

import java.util.Comparator;

public class SoftByScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMediumScore() > o2.getMediumScore()) {
            return 1;
        }
        return -1;
    }
}
