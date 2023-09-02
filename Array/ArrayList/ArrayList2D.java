import java.util.ArrayList;
import java.util.Scanner;

public class TwodArrayList {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ArrayList<ArrayList<Integer>>  list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }
            for (int i = 0 ; i < 3 ; i++){
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(scanner.nextInt());
                }
            }
            for (ArrayList<Integer> integers : list) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(integers.get(j));
                }

            }
        }


    }

