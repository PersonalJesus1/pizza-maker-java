package Pizza;

import Dough.YeastDough;
import Topping.MushroomsTopping;
import Topping.OlivesTopping;
import Topping.PeperoniTopping;

public class ItalianPizza implements Pizza {
    public  Pizza bake() {
        System.out.println("Your Italian pizza is ready!" + "\n" +
                "Ingredients: yeast dough, peperoni, olives, mushrooms");
        return new ItalianPizza(new YeastDough(), new PeperoniTopping(), new OlivesTopping(), new MushroomsTopping());
    }

    private YeastDough yeastDough;
    private PeperoniTopping peperoniTopping;
    private OlivesTopping olivesTopping;
    private MushroomsTopping mushroomsTopping;

    public YeastDough getDough() {
        return yeastDough;
    }

    public void setYeastDough(YeastDough yeastDough) {
        this.yeastDough = yeastDough;
    }

    public PeperoniTopping getPeperoniTopping() {
        return peperoniTopping;
    }

    public void setPeperoniTopping(PeperoniTopping peperoniTopping) {
        this.peperoniTopping = peperoniTopping;
    }

    public OlivesTopping getOlivesTopping() {
        return olivesTopping;
    }

    public void setOlivesTopping(OlivesTopping olivesTopping) {
        this.olivesTopping = olivesTopping;
    }

    public MushroomsTopping getMushroomsTopping() {
        return mushroomsTopping;
    }

    public void setMushroomsTopping(MushroomsTopping mushroomsTopping) {
        this.mushroomsTopping = mushroomsTopping;
    }

    public ItalianPizza(YeastDough yeastDough, PeperoniTopping peperoniTopping, OlivesTopping olivesTopping, MushroomsTopping mushroomsTopping) {
        this.yeastDough = yeastDough;
        this.peperoniTopping = peperoniTopping;
        this.olivesTopping = olivesTopping;
        this.mushroomsTopping = mushroomsTopping;
    }
    public ItalianPizza() {
        this.yeastDough = new YeastDough();
        this.peperoniTopping = new PeperoniTopping();
        this.olivesTopping = new OlivesTopping();
        this.mushroomsTopping = new MushroomsTopping();
    }
}
