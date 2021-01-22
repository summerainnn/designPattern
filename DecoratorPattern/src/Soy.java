/**
 * @author ��summerain
 * @date ��Created in 2021/1/22 3:41 ����
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}