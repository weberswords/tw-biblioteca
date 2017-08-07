import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MenuTest {
    @Test
    public void shouldPrintOneOptionWhenListHasOneOption() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);
        menu.listOptions();
        verify(printStream).println("Option 1");
    }
}