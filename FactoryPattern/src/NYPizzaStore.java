/**
 * @author ��summerain
 * @date ��Created in 2021/1/25 10:30 ����
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
