import java.io.PrintStream;

public class Main {

    public static void main(String[] args){
        PrintStream printStream = System.out;
        Library library = new Library(printStream);

        library.printGreeting();
    }
}


