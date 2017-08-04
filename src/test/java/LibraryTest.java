import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LibraryTest {
    Library library;
    PrintStream printStream;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        library = new Library(printStream);
    }


    @Test
    public void shouldPrintGreeting() {
        library.printGreeting();

        verify(printStream).println("Welcome to Biblioteca!!");

    }

    @Test
    public void shouldListNoBooksWhenTheListIsEmpty() {
        ArrayList<Book> listOfBooks = new ArrayList();

        library.listBooks(listOfBooks);

        verify(printStream).println("");
    }

    @Test
    public void shouldListOneBookWhenListHasOneBook() {

        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Harry Potter", 2000, "JK Rowling"));

        library.listBooks(listOfBooks);

        verify(printStream).println("Harry Potter, 2000, JK Rowling\n");

    }

    @Test
    public void shouldPrintAttributesOfABook() {
        ArrayList<Book> listOfBooks = new ArrayList<>();

        Book book = new Book("Harry Potter", 2007, "J.K. Rowling");

        listOfBooks.add(book);

        library.listBooks(listOfBooks);

        verify(printStream).println("Harry Potter, 2007, J.K. Rowling\n");
    }

    @Test
    public void shouldPrintListOfBooksWithAttributes(){
        ArrayList<Book> listOfBooks = new ArrayList<>();

        Book book1 = new Book("Harry Potter", 2007, "J.K. Rowling");
        Book book2 = new Book("Influence", 2017, "Some Guy");
        Book book3 = new Book("Expertise", 2010, "Goodness");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

        library.listBooks(listOfBooks);

        verify(printStream).println("Harry Potter, 2007, J.K. Rowling\nInfluence, 2017, Some Guy\nExpertise, 2010, Goodness\n");

    }

}