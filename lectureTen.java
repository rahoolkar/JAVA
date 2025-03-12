
import java.util.Scanner;

class lectureTen{
    public static void main(String [] args){
        //Arrays in Java

        Scanner sc = new Scanner(System.in);

        int [] marks = new int [3];
        //when we define an array of int and of size of 3, the memory is allocated of 12 byte and first value ko 4byte ki space milti hai 
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;

        //we can also array like this
        //int [] numbers = {12,13,14};

        //System.out.println(marks);  //this will print the value of the adress memory of the marks array
        
        for (int i = 0; i <3 ; i++) {
            System.out.println(marks[i]);
        }

        int size = sc.nextInt();

        int [] array = new int[size];

        //input
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.println(array[i]);
        }


    }
}