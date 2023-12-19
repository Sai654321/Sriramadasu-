import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        
        HashSet<String> hashSet = new HashSet<>();

        // Adding 
        hashSet.add("Apple");
         hashSet.add("Banana");
           hashSet.add("Orange");

        // Checking 
          System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Removing 
         hashSet.remove("Orange");

        // Iterating 
        System.out.println("HashSet elements:");
        for (String element : hashSet) {
              System.out.println(element);
        }
    }
}
