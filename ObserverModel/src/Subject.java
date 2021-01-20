
/**
 * @author £ºsummerain
 * @date £ºCreated in 2021/1/20 5:12 ÏÂÎç
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
