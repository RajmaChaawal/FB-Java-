import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        scanner.close();

        //AND operator->
        System.out.print("AND Result: " + (a & b) + "\n");

        //OR operator->
        System.out.print("OR Result: " + (a | b) + "\n");
        
        //XOR Operator->
        System.out.print("XOR Result: " + (a ^ b) + "\n");

        //Left Shift Operator->
        System.out.print("Left Shift Result: " + (a << 2) + "\n");

        //Right Shift Operator->
        System.out.print("Right Shift Result: " + (a >> 2) + "\n");

        //Complement Operator->
        System.out.print("Complement Result of \'a\': " + (~a) + "\n");
        System.out.print("Complement Result of \'b\': " + (~b) + "\n");
    }
}
