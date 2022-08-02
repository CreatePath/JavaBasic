package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Ch_3 {
    public static void main(String[] args) {
        // 1번
        System.out.println((80+75+55)/3);

        // 3번
        String registerNum = "881120-1068234";
        System.out.printf("YYYYMMDD: 19%s\nback: %s\n", registerNum.substring(0,6), registerNum.substring(7));

        // 5번
        String a = "a:b:c:d";
        System.out.println(a.replaceAll(":", "#"));

        // 7번
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        System.out.println(String.join(" ", myList));

        // 9번
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> numberSet = new HashSet<>(numbers);
        System.out.println(numberSet);
    }
}
