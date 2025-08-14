public class LogicalOperator {
    public static void main(String[] args) {
        // Declare and initialize boolean variables
        boolean x = true;
        boolean y = false;

        // Perform logical AND operation
        boolean andResult = x && y; // Equivalent to logical AND
        System.out.println("Result of x AND y: " + andResult);

        // Perform logical OR operation
        boolean orResult = x || y; // Equivalent to logical OR
        System.out.println("Result of x OR y: " + orResult);

        // Perform logical NOT operation
        boolean notX = !x; // Equivalent to logical NOT
        System.out.println("Result of NOT x: " + notX);

        // Demonstrating short-circuit evaluation with AND
        if (x && (y = true)) { // y will be set to true only if x is true
            System.out.println("Short-circuit AND evaluated, y is now: " + y);
        }

        // Demonstrating short-circuit evaluation with OR
        if (y || (x = false)) { // x will not be set to false since y is true
            System.out.println("Short-circuit OR evaluated, x remains: " + x);
        }
    }
    
}
