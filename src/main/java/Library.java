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

    public boolean performOption() {
        switch(menu.getUserInput()){
            case "1":
                listBooks();
                return true;
            case "quit":
                printStream.println("Thank you for visiting the Library");
                return false;
            default:
                printStream.println("Invalid Input!");
                return performOption();
        }
    }

    private void listBooks() {
        String listToReturn = "";
        for (Book book : books) {
            listToReturn += book;
        }

        printStream.println(listToReturn);
    }

    public void run() {
        while(performOption()) {}
    }
}
