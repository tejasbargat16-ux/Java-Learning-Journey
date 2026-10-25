class Notification {

    void send() {
        System.out.println("Sending notification.");
    }
}

class EmailNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending email notification.");
    }
}

class SMSNotification extends Notification {

    @Override
    void send() {
        System.out.println("Sending SMS notification.");
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        Notification notification;

        notification = new EmailNotification();
        notification.send();

        notification = new SMSNotification();
        notification.send();
    }
}
