package PizzaFactory;

import Dough.ShortbreadDough;
import Pizza.AsianPizza;
import Pizza.Pizza;
import Topping.CucumbersTopping;
import Topping.HamTopping;
import Topping.OlivesTopping;

public class AsianPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new AsianPizza(new ShortbreadDough(), new HamTopping(), new CucumbersTopping(), new OlivesTopping());
    }
}