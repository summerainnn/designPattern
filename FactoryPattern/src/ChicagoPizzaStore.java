/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/25 11:00 ÉÏÎç
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza creatPizza(String item) {
        if("cheese".equals(item)){
            return new ChicagoPizza();
        }
        return null;
    }
}
