import java.util.ArrayList;
import java.util.List;

public class AList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        int i = 0;
        while (i < list.size()) {
            System.out.print(list.get(i) + " ");
            i++;
        }

        System.out.println();

        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
