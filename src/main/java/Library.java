import java.io.PrintStream;
import java.util.ArrayList;


public class Library {


    PrintStream printStream;
    Menu menu;


    public Library(PrintStream printStream) {
        this.printStream = printStream;
        menu = new Menu(printStream);
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!!");
    }

    public void listBooks(ArrayList<Book> listOfBooks) {
        String listToReturn = "";

        for (Book book: listOfBooks) {
            listToReturn += book;
        }

        printStream.println(listToReturn);
    }

    public void printMenuOptions() {
        menu.listOptions();
    }
}
