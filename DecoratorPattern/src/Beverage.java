/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/22 2:59 ÏÂÎç
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
