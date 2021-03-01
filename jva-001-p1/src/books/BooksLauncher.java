package books;

import java.util.ArrayList;

public class BooksLauncher {

    public static void main(String[] args) {

        Book book = new Book();

        book.setName("1984");
        book.setAuthor("Orwell");
        book.setPrice(10.00);

        Cover greenCover = new Cover();
        greenCover.setColor("GREEN");

        book.setCover(greenCover);

        Page p1 = new Page();
        p1.setText("first");
        p1.setNumber(1);

        Page p2 = new Page();
        p2.setText("second");
        p2.setNumber(2);


        ArrayList<Page> pages = new ArrayList<>();
        pages.add(p1);
        pages.add(p2);

        book.setPages(pages);

        System.out.println("FINISH");

        printTitle(book);
        printPrice(book);
        printCoverColor(book);
        printCountOfPages(book);
        printPageText(book, 2);

    }


    public static void printCountOfPages(Book book) {

        System.out.println(book.getPages().size());


    }

    public static void printTitle(Book book)
    {
        System.out.println(book.getName());

    }

    public static void printPrice(Book book)
    {
        System.out.println(book.getPrice());

    }

    public static void printCoverColor(Book book)
    {
        System.out.println(book.getCover().getColor());

    }

    public static void printPageText(Book book , int pageNumber)
    {
        for (Page page : book.getPages()) {

            if (page.getNumber() == pageNumber) {
                System.out.println(page.getText());
            }
        }

    }
}
