package ArraysMetod;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WorkDublicate {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("Piter");
        list.add("Masha");
        list.add("Vova");
        list.add("Nikola");
        list.add("Ivan");
        list.add("Masha");
        list.add("Nikola");

        System.out.println(list);

        List<String> listNotD = list.stream().distinct().collect(Collectors.toList());
        System.out.println(listNotD);


        HashSet<String> set1 = new HashSet<>();

        System.out.println(set1);
        set1.addAll(list);
        System.out.println(set1);


    }
}
