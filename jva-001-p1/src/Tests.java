import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Tests {


    public static void main(String[] args) {

        ArrayList<String> info = new ArrayList<>();

        info.add("Charly");
        info.add("Janet");
        info.add("Kelly");
        info.add("Mandy");

        System.out.println(info);

        data(info.get(0) , info.get(1), info.get(2), info.get(3));

    }

    static public List<String> data(String... s) {

        List<String> list = Arrays.asList(s);

        int i = 1;

        for (String s1 : list) {

            System.out.println(i + ". " + s1);

            i++;
        }


        return list;
    }


}

