/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/18 3:07 ÏÂÎç
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
