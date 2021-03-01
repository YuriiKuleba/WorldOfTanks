package infoWorld;

public class CloneDemo implements Cloneable {

    int x;


    public static void main(String[] args) throws CloneNotSupportedException {


        CloneDemo cd = new CloneDemo();

        cd.x = 5;

        System.out.println("cd.x = " + cd.x);

        CloneDemo cd2 = (CloneDemo) cd.clone();

        System.out.println("cd2.x = " + cd2.x);
    }


}
