import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        int i = list.size()-1;
        while(!list.isEmpty()){
            System.out.println(list.get(i));
            list.remove(i--);
        }
    }
}
