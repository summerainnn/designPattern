
/**
 * @author ��summerain
 * @date ��Created in 2021/1/20 5:12 ����
 * ������ӿڣ�ʵ���������������ĺ�ȡ�������Լ�֪ͨ
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
