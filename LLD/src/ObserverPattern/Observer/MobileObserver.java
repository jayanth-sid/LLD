package ObserverPattern.Observer;

import ObserverPattern.Observable.ObservableInterface;

public class MobileObserver implements ObserverInterface {
    long mobile;
    ObservableInterface obj;

    public MobileObserver(long mobile, ObservableInterface obj) {
        this.obj = obj;
        this.mobile = mobile;
    }

    public void update() {
        sendNotificationOverMobile();
    }

    private void sendNotificationOverMobile() {
        System.out.println("Notification sent to mobile : " + this.mobile + " || Available stock: " + getStock());
    }

    private int getStock() {
        return this.obj.getData();
    }
}
