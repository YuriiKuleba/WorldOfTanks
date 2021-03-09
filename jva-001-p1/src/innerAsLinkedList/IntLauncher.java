package innerAsLinkedList;

public class IntLauncher {

    public static void main(String[] args) {


        IntegerList integerList = new IntegerList();


        integerList.addInteger(20);
        integerList.addInteger(100);
        integerList.addInteger(200);

        integerList.print();

        System.out.println();
        integerList.showInteger();
        integerList.showAlarm();


        System.out.println();
        System.out.println("Trying to get inner class: ===" + integerList.getRoot() + "===");
        System.out.println();
        System.out.println("About class: ===" + IntegerList.class.toString() + "===");

    }


}
