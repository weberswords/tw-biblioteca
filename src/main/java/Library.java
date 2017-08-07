import java.io.PrintStream;
import java.util.ArrayList;


public class Library {

    ArrayList<Book> books;
    PrintStream printStream;
    Menu menu;


    public Library(PrintStream printStream, ArrayList<Book> books) {
        this.printStream = printStream;
        menu = new Menu(printStream, books);
        this.books = books;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!!");
    }

    public void printMenuOptions() {
        menu.listOptions();
    }

    public void performOption(String optionIndex) {
        menu.performOption(optionIndex);
    }


}
