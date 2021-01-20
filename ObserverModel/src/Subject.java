
/**
 * @author ��summerain
 * @date ��Created in 2021/1/20 5:12 ����
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
