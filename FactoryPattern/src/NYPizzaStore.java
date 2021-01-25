/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/25 10:30 ÉÏÎç
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza creatPizza(String item) {
        if("cheese".equals(item)){
            return new NYStylePizza();
        }
        return null;
    }
}
