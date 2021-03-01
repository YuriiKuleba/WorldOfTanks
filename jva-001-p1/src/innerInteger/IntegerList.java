package innerInteger;

public class IntegerList {

    private final Node root;

    public IntegerList() {
        this.root = new Node(365);
    }

    public void showInteger() {
        System.out.println("This is default Integer:  " + root.getInteger());
    }

    public void showAlarm() {
        root.alarm();
    }

    public Node getRoot() {

        return root;
    }

    public void print() {
        int k = 1;

        Node node = root.getNext();
        while (node != null) {

            System.out.println("Number " + k + " is: " + node.getInteger());
            node = node.getNext();
            k++;
        }
    }

    public void addInteger(Integer i) {

        Node n = new Node(i);

        Node current = root;

        while (current.getNext() != null){

            current = current.getNext();

        }

        current.setNext(n);

    }
    private static class Node {

        private final Integer integer;
        private Node next;


        public Integer getInteger() {
            return integer;
        }
        public Node (Integer integer) {
            this.integer = integer;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void alarm() {
            System.out.println("This is inner alarm!!!");
        }


    }
}
