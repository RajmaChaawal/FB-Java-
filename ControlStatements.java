public class ControlStatements {
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        //IF statement->
        int age = 18;
        if (age >= 18) {
        System.out.println("You are eligible to vote.");
        }
        //IF-ELSE statement->
        if (age >= 18) {
        System.out.println("Adult");
        } else {
         System.out.println("Minor");
        }
         //IF-ELSE-IF Ladder->
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        }

        //SWITCH statement->
        int day = 3;
        switch (day) {  
            case 1:  
                System.out.println("Monday");  
                break;  
            case 2:  
                System.out.println("Tuesday");  
                break;  
            case 3:  
                System.out.println("Wednesday");  
                break;  
            case 4:  
                System.out.println("Thursday");  
                break;  
            case 5:  
                System.out.println("Friday");  
                break;  
            case 6:  
                System.out.println("Saturday");  
                break;  
            case 7:  
                System.out.println("Sunday");  
                break;  
            default:  
                System.out.println("Invalid day!");  
        }

        //FOR Loop->
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        //WHILE Loop->
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        //DO-WHILE Loop->
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);

        //BREAK statement->
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; 
            }
            System.out.println("i: " + i);
        }

        //CONTINUE statement->
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println("Odd i: " + i);
        }


    }
    
}
