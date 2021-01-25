import Pizza.Pizza;

/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/25 9:32 ÉÏÎç
 */
public abstract class SimplePizzaFactory {
    public Pizza orderPizza(){
        Pizza pizza;

        pizza = creatPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza creatPizza();
}
