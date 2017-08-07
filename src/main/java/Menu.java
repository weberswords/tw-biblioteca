import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {
    PrintStream printStream;
    ArrayList<String> optionList;
    ArrayList<Book> books;

    public Menu(PrintStream printStream, ArrayList<Book> books) {
        this.printStream = printStream;
        this.books = books;
        initializeOptionList();
    }

    private void initializeOptionList() {
        optionList = new ArrayList<>();
        optionList.add("Option 1");
    }

    public void listOptions() {
        for (String option : optionList) {
            printStream.println(option);
        }
    }


    public String getUserInput() {
        return "1";
    }
}
