
/**
 * @author ：summerain
 * @date ：Created in 2021/1/20 5:12 下午
 * 主题类接口，实现三个方法：订阅和取消订阅以及通知
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
