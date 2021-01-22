/**
 * @author ��summerain
 * @date ��Created in 2021/1/22 3:43 ����
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
