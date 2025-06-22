
package decorator;

public class Main {
    public static void main(String[] args) {

        // Send notification via Email only
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Welcome to the system!");

        System.out.println("---");

        // Send notification via Email + SMS
        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSMS.send("Your OTP code is 123456");

        System.out.println("---");

        // Send notification via Email + SMS + Slack
        Notifier fullNotification = new SlackNotifierDecorator(
                                        new SMSNotifierDecorator(
                                            new EmailNotifier()));
        fullNotification.send("Server down! Immediate action required.");
    }
}
