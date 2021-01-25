import java.util.ArrayList;

/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/25 9:58 ÉÏÎç
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("Prepare " + name);
        System.out.println("Tossing dough...");
        System.out.println("Add toppings :");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }
}
