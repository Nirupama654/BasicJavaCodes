package LabAssignments.FinalAssignment;
import java.util.Scanner;

class MinimumBalanceException  extends Exception{

public MinimumBalanceException(String s){
        super(s) ;
        }
        }

public class Account {
    String name;
    int acc_no ;
    double balance;

    public Account(String name , int acc_no ,double balance){
        this.name = name ;
        this.acc_no = acc_no ;
        this.balance = balance ;
    }

    void deposit(int amt){
        this.balance = this.balance + amt ;
        System.out.println("Current account Balance = "+ balance);
    }
    void withdraw(int amt)throws MinimumBalanceException{
        if(balance<500){

            throw new MinimumBalanceException("Value cannot be less than 500 in the account from whom money is being transferred!!");
        }
        else{
            balance = balance - amt ;
            if(balance<500){
                throw new MinimumBalanceException("Account Balance cannot be less than 500!!");
            }
            else{
                System.out.println("Current account Balance = " + balance);
            }
        }
    }
    void transfer(Account acc1, Account acc2, int amt)throws Exception{
        if(acc2.balance<500){
            throw new MinimumBalanceException("Value cannot be less than 500");
        }
        else if(acc2.balance-amt<500){
            throw new MinimumBalanceException("Account Balance cannot go  down from the limit!!");
        }
        else{
            System.out.println("Transfer of amount successful");
            System.out.println("Net Amount in the Destination account is : "+ (acc1.balance+amt));
        }
    }
}

class AccountCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        while(true){

            int choice ;
            System.out.println("press 1 to Deposit \n 2 for Withdrawal \n 3 for Amount Transfer \n 4.EXIT ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the AccountHolder Name");
            String name  =  sc.nextLine();
            System.out.println("Enter the Account No.");
            int acc_no = sc.nextInt() ;
            sc.nextLine();
            System.out.println("Enter the Account Balance");
            double balance = sc.nextDouble() ;
            sc.nextLine();
            Account ac = new Account(name , acc_no , balance);

            int amount  ;


            switch(choice){
                case 1 ->{
                    System.out.println("Enter the Amount to be deposited");
                    amount = sc.nextInt() ;
                    sc.nextLine();
                    ac.deposit(amount);
                }
                case 2 ->{
                    System.out.println("Enter the amount you want to withdraw");
                    amount = sc.nextInt() ;
                    sc.nextLine();
                    try{
                        ac.withdraw(amount);
                    }
                    catch(MinimumBalanceException e){
                        System.out.println(e);
                    }

                }
                case 3 ->{
                    System.out.println("Enter the amount to be transferred");
                    amount = sc.nextInt() ;
                    System.out.println("Enter the AccountHolder Name of the sender Account");
                    String name1 =  sc.nextLine();
                    System.out.println("Enter the Account No.");
                    int acc_no1 = sc.nextInt() ;
                    System.out.println("Enter the Account Balance");
                    double balance1 = sc.nextDouble() ;
                    sc.nextLine();
                   Account ac1 = new Account(name1 , acc_no1 , balance1);
                    System.out.println("Enter the AccountHolder Name of the receiver account");
                    String name2  =  sc.nextLine();
                    System.out.println("Enter the Account No.");
                    int acc_no2 = sc.nextInt() ;
                    System.out.println("Enter the Account Balance");
                    double balance2 = sc.nextDouble() ;
                    sc.nextLine();
                    Account ac2 = new Account(name2, acc_no2 , balance2);
                    try {
                        ac.transfer(ac1,ac2,amount);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                case 4-> System.exit(0);
                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }
}

