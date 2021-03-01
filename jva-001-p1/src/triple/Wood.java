package triple;

public class Wood extends Tree{

    public Wood() {

        System.out.println("Wood");
    }

    @Override
    public void about() {
        System.out.println("The wood is building material");
    }
}
