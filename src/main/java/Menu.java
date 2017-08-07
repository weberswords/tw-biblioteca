import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {
    PrintStream printStream;
    OptionManager options;

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
        options = new OptionManager(printStream);
    }


    public void listOptions() {
        options.list();
    }
}
