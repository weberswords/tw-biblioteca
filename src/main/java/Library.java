import java.io.PrintStream;
import java.util.ArrayList;


public class Library {


    PrintStream printStream;


    public Library(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!!");
    }

    public void listBooks(ArrayList<Book> listOfBooks) {
        String listToReturn = "";

        for (Book book: listOfBooks) {
            listToReturn += book + "\n";
        }




        printStream.println(listToReturn);
    }

}
