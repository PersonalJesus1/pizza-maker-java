import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import Pizza.*;

class PizzaMakerTest {

    private PizzaMaker pizzaMaker;
    private BufferedReader reader;

    @BeforeEach
    public void setUp() {
        pizzaMaker = new PizzaMaker();
    }

    @Test
    public void testAmericanPizza() throws IOException {
        reader = new BufferedReader(new StringReader("1\n4\n")); // Input for AmericanPizza and then quit
        pizzaMaker.main(reader);
        assertTrue(pizzaMaker.pizza instanceof AmericanPizza);
    }

    @Test
    public void testItalianPizza() throws IOException {
        reader = new BufferedReader(new StringReader("2\n4\n")); // Input for ItalianPizza and then quit
        pizzaMaker.main(reader);
        assertTrue(pizzaMaker.pizza instanceof ItalianPizza);
    }

    @Test
    public void testAsianPizza() throws IOException {
        reader = new BufferedReader(new StringReader("3\n4\n")); // Input for AsianPizza and then quit
        pizzaMaker.main(reader);
        assertTrue(pizzaMaker.pizza instanceof AsianPizza);

    }
}