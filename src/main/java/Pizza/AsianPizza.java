package Pizza;

import Dough.ShortbreadDough;
import Topping.CucumbersTopping;
import Topping.HamTopping;
import Topping.OlivesTopping;

public class AsianPizza implements Pizza {
    public AsianPizza bake() {
        System.out.println("Your Asian pizza is ready!" + "\n" +
                "Ingredients: shortbread dough, ham, cucumbers, olives");
        return new AsianPizza(new ShortbreadDough(), new HamTopping(), new CucumbersTopping(), new OlivesTopping());
    }

    private ShortbreadDough shortbreadDough;
    private HamTopping hamTopping;
    private CucumbersTopping cucumbersTopping;
    private OlivesTopping olivesTopping;

    public ShortbreadDough getDough() {
        return shortbreadDough;
    }

    public void setShortbreadDough(ShortbreadDough shortbreadDough) {
        this.shortbreadDough = shortbreadDough;
    }

    public HamTopping getHamTopping() {
        return hamTopping;
    }

    public void setHamTopping(HamTopping hamTopping) {
        this.hamTopping = hamTopping;
    }

    public CucumbersTopping getCucumbersTopping() {
        return cucumbersTopping;
    }

    public void setCucumbersTopping(CucumbersTopping cucumbersTopping) {
        this.cucumbersTopping = cucumbersTopping;
    }

    public OlivesTopping getOlivesTopping() {
        return olivesTopping;
    }

    public void setOlivesTopping(OlivesTopping olivesTopping) {
        this.olivesTopping = olivesTopping;
    }

    public AsianPizza(ShortbreadDough shortbreadDough, HamTopping hamTopping, CucumbersTopping cucumbersTopping, OlivesTopping olivesTopping) {
        this.shortbreadDough = shortbreadDough;
        this.hamTopping = hamTopping;
        this.cucumbersTopping = cucumbersTopping;
        this.olivesTopping = olivesTopping;
    }

}
