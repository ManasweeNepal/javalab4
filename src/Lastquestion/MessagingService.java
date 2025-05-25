package Lastquestion;

public class MessagingService {
    public static void main(String[] args) {
        Messaging sms = new Sms();
        sms.printConnection();
        sms.print();

        System.out.println();

        Messaging email = new Email();
        email.printConnection();
        email.print();
    }
}
