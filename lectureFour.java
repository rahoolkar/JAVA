import java.util.Scanner;

public class lectureFour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Loops in Java
		System.out.println("For-Loop");
		for(int counter = 0 ;counter < 5 ; counter = counter +1 ) {
			System.out.println("Helloworld");
		}
		
		for(int counter = 0 ; counter < 11 ; counter++ ) {
			System.out.print(counter + " ");
		}
		
		//While Loop
		System.out.println("While-Loop");
		int i = 0 ;
		while(i<11) {
			System.out.print(i+"-");
			i = i +1 ;
		}
		
		System.out.println("do while Looop");
		do {
			System.out.println("do while loop");
		}while(false) ;

        //sum of n natural numbers
        int n = sc.nextInt();
        int sum = 0 ;
        for(int count=1 ; count<=n ; count++){
            sum = sum + count ;
        }
        System.out.println(sum);

        //print a table of number
        int number = 2; 
        for(int count=1 ; count<=10 ; count++){
            System.out.print(count*number+ " ");
        }
    }
}
