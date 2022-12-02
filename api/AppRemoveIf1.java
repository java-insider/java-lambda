package api;

import java.util.ArrayList;
import java.util.Arrays;

public class AppRemoveIf1 {

    public static void main(String[] args) {
        var letters = new ArrayList<>(Arrays.asList('A', 'b', 'C', 'd', 'E', 'f'));
        System.out.println(letters);

//        Iterator<Character> iter = letters.iterator();
//        while (iter.hasNext()) {
//            var c = iter.next();
//            if (Character.isLowerCase(c)) {
//                iter.remove();
//            }
//        }

        letters.removeIf(Character::isLowerCase);
        System.out.println(letters);
    }
}
