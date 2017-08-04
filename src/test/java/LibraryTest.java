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
        listOfBooks.add(new Book("Harry Potter"));

        library.listBooks(listOfBooks);

        verify(printStream).println("Harry Potter");

    }

}