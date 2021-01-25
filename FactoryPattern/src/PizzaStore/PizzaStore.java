package PizzaStore;

import Pizza.*;

/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/25 9:44 ÉÏÎç
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = creatPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza creatPizza(String type);

}
