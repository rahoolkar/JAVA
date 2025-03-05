public class lectureFive {
    public static void main(String[] args) {
        //Patterns 
        int rows = 4 ;
        int cols = 5 ; 
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //pattern-2
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //pattern-3
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-4
        for(int i=0; i<rows; i++){
            for(int j=1; j<=(rows-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //pattern-5
        int itr=1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(itr+" ");
                itr++;
            }
            System.out.println();
        }
        System.out.println();

        //pattern-6
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
