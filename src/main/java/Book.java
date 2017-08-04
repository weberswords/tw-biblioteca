import java.io.PrintStream;

public class Book {

    PrintStream printStream;

    public Book(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!!");
    }
}
