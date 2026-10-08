import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Dhiraj", 75));
        students.add(new Student(101, "Kalash", 85));
        students.add(new Student(102, "Gaurav", 65));
        students.add(new Student(105, "Bishal", 62));
        students.add(new Student(106, "Shraddha", 61));

        Comparator<Student> marksComparator = new Comparator<Student>() {

            // Ascending order
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.id, s2.id);
            }

            // Descending order
            // public int compare(Student s1, Student s2){
            // return Integer.compare(s2.id, s1.id);
            // }

        };

        Collections.sort(students, marksComparator);

        for (Student s : students) {
            System.out.println(
                    s.id + " " + s.name + " " + s.marks);
        }
    }
}