
import java.util.Scanner;

class lectureEleven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int rows = sc.nextInt();
		int cols = sc.nextInt();
        int x = sc.nextInt();
		
		int [][] numbers = new int [rows][cols];
		
		//taking input
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numbers[i][j]);
			}
            System.out.println();
		}

        //finding an element
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(numbers[i][j]==x) {
					System.out.println(i + " " + j);
				}
			}
		}
    }
}