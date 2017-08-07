import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {
    PrintStream printStream;
    ArrayList<String> optionList = new ArrayList<String>();

    public Menu(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void addOption(String s) {
        optionList.add(s);
    }

    public void listOptions() {
        for (String option : optionList) {
            String optionString = option;
            printStream.println(optionString);
        }
    }
}
