import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        PizzaMaker pizzaMaker = new PizzaMaker();
        pizzaMaker.main(READER);
    }
}

