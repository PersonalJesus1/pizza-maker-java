package PizzaFactory;

import Dough.YeastDough;
import Pizza.AmericanPizza;
import Pizza.Pizza;
import Topping.BeconTopping;
import Topping.CucumbersTopping;
import Topping.TomatoesTopping;

public class AmericanPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new AmericanPizza(new YeastDough(), new CucumbersTopping(), new TomatoesTopping(), new BeconTopping());
    }
}