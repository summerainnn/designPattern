/**
 * @author ��summerain
 * @date ��Created in 2021/1/22 2:59 ����
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
