/**
 * @author ��summerain
 * @date ��Created in 2021/1/25 11:00 ����
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
