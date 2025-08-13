public class JavaArrays {
    public static void main(String[] args){
        // Declare and initialize an integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the integer array
        for (int number : numbers) {
            System.out.println(number);
        }

        // Declare and initialize an String Array
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Print the elements of the string array
        for (String fruit : fruits) {
            System.out.println(fruit);

        //For accessing specific elements in the array
        System.out.println("First fruit: " + fruits[0]);
        }
    }
    
}
