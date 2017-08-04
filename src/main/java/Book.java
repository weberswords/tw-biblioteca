import java.io.PrintStream;

public class Book {

    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, int yearPublished, String author) {
        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    @Override
    public String toString(){
        String stringOutput = String.format("%-10s %10d %10s", title, yearPublished, author);
        return stringOutput;
    }




}
