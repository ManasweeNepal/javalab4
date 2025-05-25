package Lastquestion;

  import java.util.Scanner;


public class Email implements Messaging {

   Scanner sc = new Scanner(System.in);

    @Override
    public String getMessage() {
      
        System.out.print("Enter Email message: ");
        return sc.nextLine();
       
    }

    @Override
    public String getRecipient() {
       
        System.out.print("Enter email address: ");
        return sc.nextLine();
     
    }

    @Override
    public void print() {
        String recipient = getRecipient();
        String message = getMessage();
        System.out.println("Sending Email to " + recipient + ": " + message);
 
      }
      //sc.close();
}
