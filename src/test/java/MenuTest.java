import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MenuTest {
    @Test
    public void shouldPrintOneOptionWhenListHasOneOption() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        ArrayList<Book> books = new ArrayList<>();
        Menu menu = new Menu(printStream, books);
        menu.listOptions();
        verify(printStream).println("Option 1");
    }
}