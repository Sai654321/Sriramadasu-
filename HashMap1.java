import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        // Creating 
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Adding 
       studentGrades.put("krishna", 85);
        studentGrades.put("ram", 92);
         studentGrades.put("shiva", 78);

        // Accessing 
           System.out.println("ram Grade: " + studentGrades.get("ram"));

        // Updating 
          studentGrades.put("shiva", 90);

        // Removing 
         studentGrades.remove("shiva");

        // Iterating 
         System.out.println("Student Grades:");
        for (String name : studentGrades.keySet()) {
               System.out.println(name + ": " + studentGrades.get(name));
        }
    }
}