/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/22 3:44 ÏÂÎç
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ " + espresso.cost());

        Beverage espresso2 = new Espresso();
        espresso2 = new Mocha(espresso2);
        espresso2 = new Soy(espresso2);
        espresso2 = new Whip(espresso2);
        System.out.println(espresso2.getDescription() + " $ " + espresso2.cost());
    }
}
