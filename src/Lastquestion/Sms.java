package Lastquestion;

import java.util.Scanner;
public class Sms implements Messaging {
  
     Scanner scanner = new Scanner(System.in);

    @Override
     public String getMessage(){
      
        System.out.print("Enter SMS message: ");
        return scanner.nextLine();
       
      }
   
      @Override  
    public String getRecipient(){
   
        System.out.print("Enter mobile number: ");
        String number = scanner.nextLine();
        if (number.matches("\\d{10}")) {
            return number;
        } else {
            return "Invalid mobile number";
        }
       
    }  
     public void print(){
       String message= getMessage();
       String number= getRecipient();
       System.out.println("The message you entered: " +message); 
       System.out.println("The number you entered: " +number);
    } 
   // scanner.close();
 }



