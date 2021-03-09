package filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo {

    interface Filter {

        boolean test(String s);
    }

    public static void main(String[] args) {


        List<String> data = Arrays.asList("Kate" , "Bella" , "Holly" , "Mira");
        System.out.println(data);


        System.out.println(filter(data , s -> s.endsWith("a")));

        /*
            System.out.println(filter(data , new Filter() {
            @Override
            public boolean test(String s) {
                return s.endsWith("a");
            }
        }));

         */


        System.out.println(filter(data , s -> s.startsWith("H")));

        /*  System.out.println(filter(data , new Filter() {
            @Override
            public boolean test(String s) {
                return s.startsWith("H");
            }
        }));*/

    }


    static List<String> filter(List<String> data , Filter filter) {

        List<String> result = new ArrayList<>();

        for (String s : data) {

            if (filter.test(s)) {

                result.add(s);
            }
        }

        return result;
    }
}
