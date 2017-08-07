import java.io.PrintStream;
import java.util.ArrayList;

public class OptionManager {
    PrintStream printStream;
    ArrayList<String> optionList;

    public OptionManager(PrintStream printStream) {
        this.printStream = printStream;
        initializeOptionList();
    }

    private void initializeOptionList() {
        optionList = new ArrayList<>();
        optionList.add("Option 1");
    }

    public void list() {
        for (String option : optionList) {
            printStream.println(option);
        }
    }
}
