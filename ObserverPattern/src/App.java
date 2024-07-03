import ObserverPattern.Observable.*;
import ObserverPattern.Observer.*;;

public class App {
    public static void main(String[] args) throws Exception {

        ObservableInterface iphoneStockObserver = new IphoneObservable();

        ObserverInterface obs1 = new EmailObserver("abc@gmail.com", iphoneStockObserver);
        ObserverInterface obs2 = new EmailObserver("xyz@gmail.com", iphoneStockObserver);
        ObserverInterface obs3 = new MobileObserver(91344378, iphoneStockObserver);

        iphoneStockObserver.add(obs1);
        iphoneStockObserver.add(obs2);
        iphoneStockObserver.add(obs3);

        iphoneStockObserver.setData(10);
        iphoneStockObserver.setData(100);
        iphoneStockObserver.setData(0);
        iphoneStockObserver.setData(90);

    }
}
