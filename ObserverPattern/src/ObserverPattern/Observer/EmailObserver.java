package ObserverPattern.Observer;

import ObserverPattern.Observable.ObservableInterface;

public class EmailObserver implements ObserverInterface {
    private String email;
    private ObservableInterface obj;

    public EmailObserver(String email, ObservableInterface obj) {
        this.obj = obj;
        this.email = email;
    }

    public void update() {
        sendNotificationOverEmail();
    }

    private void sendNotificationOverEmail() {
        System.out.println("Notification sent to email : " + this.email + " || Available stock: " + getStock());
    }

    private int getStock() {
        return this.obj.getData();
    }
}
