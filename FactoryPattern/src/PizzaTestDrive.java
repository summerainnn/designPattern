import Pizza.Pizza;
import PizzaStore.*;


/**
 * @author ��summerain
 * @date ��Created in 2021/1/25 10:51 ����
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore NYStore = new NYPizzaStore();
        PizzaStore ChicagoStore = new ChicagoPizzaStore();

        Pizza pizza = NYStore.orderPizza("cheese");
        Pizza pizza1 = ChicagoStore.orderPizza("cheese");
        System.out.println("Order two !");
    }
}
