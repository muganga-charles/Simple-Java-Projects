package Project1;

import java.util.Scanner;

import Student.Making;

public class User {
    public static void main(String[] args) {
        Payments user1;

        user1 = new Payments();
        System.out.println(user1.describeProgram());
        int amount;
        double rate;
        int time;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount");
        amount = input.nextInt();
        System.out.println("Enter the rate");
        rate = input.nextDouble();
        System.out.println("Enter the Period");
        time = input.nextInt();
        

        user1.setCredentials(amount, time, rate);
        System.out.println("The monthly payment is : "+user1.monthlyPayments());

        
    }
}
