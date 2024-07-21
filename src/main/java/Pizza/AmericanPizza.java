package Pizza;

import Dough.Dough;
import Dough.YeastDough;
import Topping.BeconTopping;
import Topping.CucumbersTopping;
import Topping.TomatoesTopping;

public class AmericanPizza implements Pizza {
    public AmericanPizza bake() {
        System.out.println("Your American pizza is ready!" + "\n" +
                "Ingredients: yeast dough, cucumbers,tomatoes, becon");
        return new AmericanPizza(new YeastDough(), new CucumbersTopping(), new TomatoesTopping(), new BeconTopping());
    }

    public YeastDough getYeastDough() {
        return yeastDough;
    }

    public void setYeastDough(YeastDough yeastDough) {
        this.yeastDough = yeastDough;
    }

    public Dough getDough() {
        return yeastDough;
    }


    public CucumbersTopping getCucumbersTopping() {
        return cucumbersTopping;
    }

    public void setCucumbersTopping(CucumbersTopping cucumbersTopping) {
        this.cucumbersTopping = cucumbersTopping;
    }

    public TomatoesTopping getTomatoesTopping() {
        return tomatoesTopping;
    }

    public void setTomatoesTopping(TomatoesTopping tomatoesTopping) {
        this.tomatoesTopping = tomatoesTopping;
    }

    public BeconTopping getBeconTopping() {
        return beconTopping;
    }

    public void setBeconTopping(BeconTopping beconTopping) {
        this.beconTopping = beconTopping;
    }

    private YeastDough yeastDough;
    private CucumbersTopping cucumbersTopping;
    private TomatoesTopping tomatoesTopping;
    private BeconTopping beconTopping;

    public AmericanPizza(YeastDough yeastDough, CucumbersTopping cucumbersTopping, TomatoesTopping tomatoesTopping, BeconTopping beconTopping) {
        this.yeastDough = yeastDough;
        this.cucumbersTopping = cucumbersTopping;
        this.tomatoesTopping = tomatoesTopping;
        this.beconTopping = beconTopping;
    }
}
