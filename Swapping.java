import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int x,y;
        System.out.print("Enter first number (x): ");
        x = Scan.nextInt();
        System.out.print("Enter second number (y): ");
        y = Scan.nextInt();
        Scan.close();

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        int temp = x; 
        x = y;
        y = temp;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
    
}
