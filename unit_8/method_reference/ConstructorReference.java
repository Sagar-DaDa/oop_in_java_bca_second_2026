interface StudentCreator {
    Student create(String name);
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ConstructorReference {

    public static void main(String[] args) {

        StudentCreator creator = Student::new;

        Student s = creator.create("Sagar");

        System.out.println(s.name);
    }
}
