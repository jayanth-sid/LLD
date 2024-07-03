package ObserverPattern.Observable;

import ObserverPattern.Observer.ObserverInterface;

public interface ObservableInterface {

    public void add(ObserverInterface obj);

    public void remove(ObserverInterface obj);

    public void notice();

    public void setData(int newStock);

    public int getData();
}
