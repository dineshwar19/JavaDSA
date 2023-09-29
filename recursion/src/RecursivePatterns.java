public class RecursivePatterns {
    public static void main(String[] args) {
        normalpattern(2,0);
    }
    static void pattern(int row ,int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*");
            pattern(row,col + 1);
        }else{
            System.out.println();
            pattern(row - 1 , 0);
        }
    }
    static void normalpattern(int row , int col){
        if(row == 0){
            return;
        }
        if(col < row){
            normalpattern(row,col + 1);
            System.out.print("*");
        }else{
            normalpattern(row - 1 , 0);
            System.out.println();
        }
    }
}
