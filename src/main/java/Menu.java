import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    PrintStream printStream;
    ArrayList<String> optionList;
    ArrayList<Book> books;
    Scanner scanner;

    public Menu(PrintStream printStream, Scanner scanner) {
        this.printStream = printStream;
        this.books = books;
        this.scanner = scanner;
        initializeOptionList();
    }

    private void initializeOptionList() {
        optionList = new ArrayList<>();
        optionList.add("1) List Books");
    }

    public void listOptions() {
        for (String option : optionList) {
            printStream.println(option);
        }
    }


    public String getUserInput() {

        printStream.println("Choose an option: ");
        listOptions();

        return scanner.nextLine();

    }
}
