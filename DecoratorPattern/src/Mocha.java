import com.sun.jndi.ldap.Ber;

/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/22 3:30 ÏÂÎç
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
