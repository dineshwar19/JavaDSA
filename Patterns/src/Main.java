public class Main {
    public static void main(String[] args) {
        int n = 28;
        pattern9(n);
    }
    static void pattern(int n){
        /*
         *****
         *****
         *****
         *****
         *****
        */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n ){
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        for (int row = 1; row <= 2*n - 1; row++) {
            int totalCols = row > n ? 2*n - row : row;
                for (int col = 1; col <= totalCols; col++) {
                    System.out.print("* ");
                }
            System.out.println();

            }

    }
    static void pattern5(int n){
        /*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
         */
        for (int row = 1; row <= 2*n - 1; row++) {
            int totalCols = row > n ? 2*n - row : row;
            int spaces = n - totalCols;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern6(int n){
        /*
             *
            **
           ***
          ****
         *****
         */
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int space = 1; space <= spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }static void pattern7(int n){
        /*
         *****
          ****
           ***
            **
             *
         */
        for (int row = 1; row <= n ; row++) {
            int spaces = row - 1;
            for (int space = 1; space <= spaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        /*
             *
            ***
           *****
          *******
         *********
         */
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int space = 1; space <= spaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1  ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        /*
         *********
          *******
           *****
            ***
             *
         */
        for (int row = 1 ; row <= n ; row++){
            int spaces = row - 1;
            for (int space = 1; space <= spaces ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(n-row) + 1 ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
