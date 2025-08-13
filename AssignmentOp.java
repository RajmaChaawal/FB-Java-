public class AssignmentOp {
    public static void main(String[] args) {
        // Declare and initialize an integer variable
        int a = 10;
        int b = 20;

        // Perform assignment operation
        a += b; // Equivalent to a = a + b

        // Print the result
        System.out.println("Value of a after assignment: " + a);

        // Demonstrating another assignment operation
        b -= 5; // Equivalent to b = b - 5
        System.out.println("Value of b after assignment: " + b);

        // Using assignment with multiplication
        a *= 2; // Equivalent to a = a * 2          
        System.out.println("Value of a after multiplication: " + a);
        // Using assignment with division
        b /= 2; // Equivalent to b = b / 2  
        System.out.println("Value of b after division: " + b);
        // Using assignment with modulus
        a %= 3; // Equivalent to a = a % 3  
        System.out.println("Value of a after modulus: " + a);
    }
    
}
