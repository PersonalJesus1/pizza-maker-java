import Dough.ShortbreadDough;
import Dough.YeastDough;
import Pizza.*;
import Topping.*;
import java.io.BufferedReader;
import java.io.IOException;

public class PizzaMaker {
    Pizza pizza;
    int choiceOfPizza;

    public void main(BufferedReader reader) {
        boolean isRight = false;
        do {
            try {
                System.out.println("What kind of pizza you would like: 1. American, 2.Italian, 3. Asian, 4. Quit");
                choiceOfPizza = Integer.parseInt(reader.readLine());
                switch (choiceOfPizza) {
                    case 1: {
                        pizza = new AmericanPizza(new YeastDough(), new CucumbersTopping(), new TomatoesTopping(), new BeconTopping());
                        pizza.bake();
                        break;
                    }
                    case 2: {
                        pizza = new ItalianPizza(new YeastDough(), new PeperoniTopping(), new OlivesTopping(), new MushroomsTopping());
                        pizza.bake();
                        break;
                    }
                    case 3: {
                        pizza = new AsianPizza(new ShortbreadDough(), new HamTopping(), new CucumbersTopping(), new OlivesTopping());
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
