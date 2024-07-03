package ObserverPattern.Observable;

import java.util.ArrayList;

import ObserverPattern.Observer.ObserverInterface;

public class IphoneObservable implements ObservableInterface {
    private ArrayList<ObserverInterface> observerList = new ArrayList<>();
    private int stock = 0;

    public void add(ObserverInterface obj) {
        observerList.add(obj);
    }

    public void remove(ObserverInterface obj) {
        observerList.remove(obj);
    }

    public void notice() {
        for (ObserverInterface obj : observerList) {
            obj.update();
        }
    }

    public void setData(int newStock) {
        if (stock == 0) {
            notice();
        }
        this.stock = newStock;
    }

    public int getData() {
        return this.stock;
    }
}
