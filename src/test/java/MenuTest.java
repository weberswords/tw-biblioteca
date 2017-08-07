import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MenuTest {
    @Test
    public void shouldPrintOneOptionWhenListHasOneOption() throws Exception {
        Scanner scanner = new Scanner(System.in);
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream, scanner);
        menu.listOptions();
        verify(printStream).println("1) List Books");
    }

    @Test
    public void shouldReturnOneWhenUserSubmitsOne() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Scanner scanner;
        Menu menu;
        String data = "1";
        InputStream stdIn = System.in;
        try {
            System.setIn(new ByteArrayInputStream(data.getBytes()));
            scanner = new Scanner(System.in);
            menu = new Menu(printStream, scanner);
        } finally {
            System.setIn(stdIn);
        }

        String input = menu.getUserInput();
        assertEquals(input, "1");
    }
}