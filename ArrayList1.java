import java.util.ArrayList;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class ArrayList1 {
    public static void main(String[] args) {
        
        ArrayList<Student> studentList = new ArrayList<>();

        // Adding 
        studentList.add(new Student("Ram"));
        studentList.add(new Student("shiva"));
        studentList.add(new Student("krishna"));

        
        System.out.println("Student List:");
        for (Student student : studentList) {
            System.out.println(student.name);
        }
    }
}
