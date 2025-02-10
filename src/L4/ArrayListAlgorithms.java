package L4;

import java.util.ArrayList;

public class ArrayListAlgorithms {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

        // before:
        System.out.println(names);

        // complete me:
        for (int idx=0; idx < names.size(); idx++)
        {
            if (names.get(idx).length() == 5) {
                names.remove(idx);
                idx --;
            }
        }

        System.out.println(names);
    }
}
