import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.mockito.Mockito.*;

public class LibraryTest {
    Library library;
    PrintStream printStream;
    ArrayList<Book> listOfBooks;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        listOfBooks = new ArrayList<Book>();
        library = new Library(printStream, listOfBooks);
    }


    @Test
    public void shouldPrintGreeting() {
        library.printGreeting();

        verify(printStream).println("Welcome to Biblioteca!!");

    }

    @Test
    public void shouldListNoBooksWhenTheListIsEmpty() {

        library.performOption();

        verify(printStream).println("");
    }

    @Test
    public void shouldListOneBookWhenListHasOneBook() {

        listOfBooks.add(new Book("Harry Potter", 2000, "JK Rowling"));

        library.performOption();

        verify(printStream).println("Harry Potter\t2000\tJK Rowling\n");

    }

    @Test
    public void shouldPrintAttributesOfABook() {
        Book book = new Book("Harry Potter", 2007, "J.K. Rowling");

        listOfBooks.add(book);

        library.performOption();

        verify(printStream).println("Harry Potter\t2007\tJ.K. Rowling\n");
    }

    @Test
    public void shouldPrintListOfBooksWithAttributes(){

        Book book1 = new Book("Harry Potter", 2007, "J.K. Rowling");
        Book book2 = new Book("Influence", 2017, "Some Guy");
        Book book3 = new Book("Expertise", 2010, "Goodness");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        library.performOption();

        verify(printStream).println("Harry Potter\t2007\tJ.K. Rowling\n" +
                                    "Influence\t2017\tSome Guy\n" +
                                    "Expertise\t2010\tGoodness\n");

    }

    @Test
    public void shouldPrintOneMenuOptionWhenOneMenuOptionPresent() {
        library.printMenuOptions();

        verify(printStream).println("1) List Books");
    }

    @Test
    public void shouldPerformOptionListBooks() throws Exception {
        Book book1 = new Book("Harry Potter", 2007, "J.K. Rowling");
        Book book2 = new Book("Influence", 2017, "Some Guy");
        Book book3 = new Book("Expertise", 2010, "Goodness");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        library.performOption();

        verify(printStream).println("Harry Potter\t2007\tJ.K. Rowling\n" +
                "Influence\t2017\tSome Guy\n" +
                "Expertise\t2010\tGoodness\n");
    }

    @Test
    @Ignore
    public void shouldReturnGoodbyeMessageWhenQuitSelected() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Scanner scanner;
        Menu menu;
        String data = "quit";
        InputStream stdIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            scanner = new Scanner(System.in);
            menu = new Menu(printStream, scanner);
        } finally {
            System.setIn(stdIn);
        }

        library.menu = menu;
        library.performOption();

        verify(printStream).println("Choose an option: ");
        verify(printStream).println("1) List Books");
        verify(printStream).println("To quit type \"quit\"");
        verify(printStream).println("Thank you for visiting the Library");
    }


}