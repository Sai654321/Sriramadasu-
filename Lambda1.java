
interface Cal {
    int num(int a, int b);
}

public class Lambda1 {
    public static void main(String[] args) {
        
        Cal addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.num(5, 3));

        
        Cal  subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.num(5, 3));
    }
}
