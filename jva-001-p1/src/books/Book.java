package books;

import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private double price;

    private Cover cover;

    private ArrayList<Page> pages;

    public Book() {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public Cover getCover()
    {
        return cover;
    }

    public void setCover(Cover cover)
    {
        this.cover = cover;
    }

    public ArrayList<Page> getPages()
    {
        return pages;
    }

    public void setPages(ArrayList<Page> pages)
    {
        this.pages = pages;
    }
}

