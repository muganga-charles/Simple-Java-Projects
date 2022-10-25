package Project1;

import java.util.Scanner;

public class Payments {
    
    private int loanAmount;
    private double intrestRate;
    private int loanPeriod;
    
    public Payments (){
        loanAmount = 0;
        intrestRate = 0.00;
        loanPeriod = 0;
    }
    public int getloanAmount(){
        return loanAmount;
    }
    public int getLoanPeriod(){
        return loanPeriod;
    }
    public double getInterstRate(){
        return (intrestRate/100);
    }
    public String describeProgram(){
        return "Loan Calculator";
    }
    public void setCredentials(int amount, int period, double  rate){
        loanAmount =   amount;
        loanPeriod = period;
        intrestRate =  rate;

    }public void getInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amount");
        loanAmount = input.nextInt();
        System.out.println("Enter the rate");
        intrestRate = input.nextDouble();
        System.out.println("Enter the Period");
        loanPeriod = input.nextInt();
    }
    public double monthlyPayments(){
        return this.getloanAmount()*this.getInterstRate()*this.getLoanPeriod();
    }
    public void start(){
        System.out.println( describeProgram());
        getInput();
        System.out.println( monthlyPayments());
    }
}
