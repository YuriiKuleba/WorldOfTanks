package triple;

public class Tree extends Forest{

    public Tree() {

        System.out.println("Tree");
    }


    @Override
    public void about() {
        System.out.println("The tree is a wooden product");
    }
}
