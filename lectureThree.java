import java.util.*;

public class lectureThree{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("a is equal");
		}else if(a > b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		
		//switch statements
		String ch = sc.next();
		
		switch (ch) {
		case "a" : 
			System.out.println("Namaste");
			break ;
			
		case "b" : 
			System.out.println("Hello");
			break ; 
			
		case "c" : 
			System.out.println("Nomoskaar");
			break ;
		default : 
			System.out.println("Invalid Button");
		}
    }
}