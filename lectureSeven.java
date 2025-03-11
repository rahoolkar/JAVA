
import java.util.Scanner;

class lectureSeven{
    //defining a function
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }
    public static void addTwoNumbers(int a, int b){
        int c = a + b; 
        System.out.println(c);
        return ;
    }
    public static int multiplyTwoNumbers(int a,int b){
        int product = a*b;
        return product;
    }
    public static int calculateFactorial(int n){
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact * i ;
        }
        return fact;
    }
    public static void main(String[] args) {
        //Functions in java
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        //calling a function
        printMyName(name);
        System.out.println("after code");

        addTwoNumbers(a,b);
        System.out.println("after code");

        System.out.println("Product of two numbers " + multiplyTwoNumbers(a, b));

        System.out.println("Factorial of number is " + calculateFactorial(n));
    }
}