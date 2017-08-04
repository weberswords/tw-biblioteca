import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookTest {

    @Test
    public void shouldPrintGreeting() {
        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book(printStream);

        book.printGreeting();

        verify(printStream).println("Welcome to Biblioteca!!");

    }


}