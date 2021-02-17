class Tests {

//    static final  double rand = 343.36564565659;

    public static void main(String[] args) {
        int x = 5;
        int y = 5;

        String transformX = x + "";
        String transformY = y + "";
        String uniteXY = transformX + "_" + transformY;

        System.out.println(uniteXY);


       /* String data = rand + "";

        System.out.println("Whole: " + data.substring(0, data.indexOf(".")));
        System.out.println("Fract: " + data.substring(data.indexOf(".") + 1));*/

       /* double fraction = rand;

        int convert = (int) rand;
        int convert2 = (int) Math.round((fraction % convert) * 100);

        System.out.println("whole: " + convert + ", fract: " + convert2);


        String str = "343.36";

        String str1 = str.substring(0, 3);
        String str2 = str.substring(4);
        System.out.print("whole: " + str1);
        System.out.println(", fract: " + str2);
*/

    }
}
