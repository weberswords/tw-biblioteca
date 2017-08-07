import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Library {

    ArrayList<Book> books;
    PrintStream printStream;
    Menu menu;


    public Library(PrintStream printStream, ArrayList<Book> books) {
        this.printStream = printStream;
        menu = new Menu(printStream, new Scanner(System.in));
        this.books = books;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!!");
    }

    public void printMenuOptions() {
        menu.listOptions();
    }

    public void performOption() {
        switch(menu.getUserInput()){
            case "1":
                listBooks();
                break;
            default:
                printStream.println("Invalid Input!");
        }
    }

    private void listBooks() {
        String listToReturn = "";
        for (Book book : books) {
            listToReturn += book;
        }

        printStream.println(listToReturn);
    }


}
