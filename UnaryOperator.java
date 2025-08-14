public class UnaryOperator {
    public static void main(String[] args){
        //Increment and Decrement Operators:
        int a = 5;
        System.out.println("Initial value of a: " + a);
        //Pre Increment:
        System.out.println("Before using \'++a\': " + a);
        System.out.println("After using \'++a\' :" + (++a));
        a--;//TO gain original value

        //Post Increment:
        System.out.println("Before using \'a++\': " + a);
        System.out.println("After using \'a++\' :" + (a++));


        //Pre Decrement:
        System.out.println("Before using \'--a\': " + a);
        System.out.println("After using \'--a\' :" + (--a));
        a++; //TO gain original value

        //Post Decrement:
        System.out.println("Before using \'a--\': " + a);
        System.out.println("After using \'a--\' :" + (a--));
        



    }
}
