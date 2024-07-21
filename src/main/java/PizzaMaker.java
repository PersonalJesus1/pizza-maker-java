import Pizza.*;
import PizzaFactory.AmericanPizzaFactory;
import PizzaFactory.AsianPizzaFactory;
import PizzaFactory.ItalianPizzaFactory;
import PizzaFactory.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;

public class PizzaMaker {
    Pizza pizza;
    int choiceOfPizza;
    PizzaFactory pizzaFactory;

    public void main(BufferedReader reader) {
        boolean isRight = false;
        do {
            try {
                System.out.println("What kind of pizza you would like: 1. American, 2.Italian, 3. Asian, 4. Quit");
                choiceOfPizza = Integer.parseInt(reader.readLine());
                switch (choiceOfPizza) {
                    case 1: {
                        pizzaFactory = new AmericanPizzaFactory();
                        pizza = pizzaFactory.createPizza();
                        pizza.bake();
                        System.out.println(pizza);
                        break;
                    }
                    case 2: {
                        pizzaFactory = new ItalianPizzaFactory();
                        pizza = pizzaFactory.createPizza();
                        pizza.bake();
                        break;
                    }
                    case 3: {
                        pizzaFactory = new AsianPizzaFactory();
                        pizza = pizzaFactory.createPizza();
                        pizza.bake();
                        break;
                    }
                    case 4: {
                        isRight = true;
                        break;
                    }
                    default:
                        System.out.println("You have written a wrong number, try again");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("You have written a wrong information. Try again");
            }
        } while (!isRight);
    }
}
