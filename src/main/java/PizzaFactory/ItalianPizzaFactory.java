package PizzaFactory;

import Dough.YeastDough;
import Pizza.ItalianPizza;
import Pizza.Pizza;
import Topping.MushroomsTopping;
import Topping.OlivesTopping;
import Topping.PeperoniTopping;

public class ItalianPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new ItalianPizza(new YeastDough(), new PeperoniTopping(), new OlivesTopping(), new MushroomsTopping());
    }
}