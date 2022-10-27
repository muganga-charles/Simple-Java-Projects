package Student;
import javax.swing.*;
public class Dataentry {
    public static void main(String[] args){
        Making Passbook;// calling the constructor 
        
        String name  = JOptionPane.showInputDialog("Enter the name");
        String phone = JOptionPane.showInputDialog("Enter the phone");
        String registration = JOptionPane.showInputDialog("Enter the registration number");
        String access = JOptionPane.showInputDialog("Enter the access number");
        String signature = JOptionPane.showInputDialog("Enter the signature");
        String courseName = JOptionPane.showInputDialog("Enter the course name");
        int Year = 1;
        System.out.println();
        int semister = 1;

        Passbook = new Making();
        //Passbook.getYear();

        Passbook.setCredentials(name, access, phone, registration,signature,courseName,Year,semister);
        System.out.println(Passbook.displayCredentials());
        //JOptionPane.showInputDialog
    }
}
