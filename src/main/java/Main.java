import java.io.PrintStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        PrintStream printStream = System.out;
        ArrayList<Book> listOfBooks = new ArrayList<>();
        Library library = new Library(printStream, listOfBooks);

        library.printGreeting();
        Book book1 = new Book("Harry Potter", 2007, "J.K. Rowling");
        Book book2 = new Book("Influence", 2017, "Some Guy");
        Book book3 = new Book("Expertise", 2010, "Goodness");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        //library.listBooks(listOfBooks);
//        library.performOption();
        library.run();

    }
}


