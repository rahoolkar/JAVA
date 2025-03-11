class lectureSix{
    public static void main(String [] args){
        //advance pattern question - butterfly question 
        int n = 4 ; 
        for(int i=1; i<=n ; i++){
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=(2*(n-i)) ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n; i>=1 ; i--){
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=(2*(n-i)) ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        int n2 = 5; 
        for(int i=1; i<=n2 ; i++){
            //spaces
            for(int j=1 ; j<=(n2-i) ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n2 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        int count = 1 ;
        for(int i=1; i<=n2; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count);
            }
            System.out.println();
            count ++;
        }
    }
}