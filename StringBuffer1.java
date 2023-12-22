public class StringBuffer1 {
    public static void main(String[] args) {
        
        StringBuffer buffer = new StringBuffer("Hello");

        
        buffer.append(" World");

        
        buffer.insert(5, " Hyderabad");

        
          buffer.delete(6, 11);

        
        buffer.replace(0, 5, "adibatla");

        
          buffer.reverse();

        
        System.out.println("Final Result: " + buffer.toString());
    }
}
