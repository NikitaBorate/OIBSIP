import java.util.*;


public class Atm  {
    public static void main(String args[]){
       int bal=5000,withdraw,deposit,n;
       int pin = 1001;
        Scanner sc = new Scanner(System.in);
        Scanner keyboard = new Scanner (System.in); 
          System.out.println("Welcome to Atm");
           System.out.println("Enter your PIN");
           int entry = keyboard.nextInt();
           while(entry!=pin){
            System.out.println("\n Incorrect Pin...Try Again");
            System.out.println("Enter ypur PIN");
            entry = keyboard.nextInt();
           }
        
         do {
          System.out.println(" 1.Withdrawal");
          System.out.println(" 2.Deposit :");
          System.out.println(" 3.Balance Status :");
          System.out.println(" 4.Transfers and payments :"); 
          System.out.println(" 5.Exit");
          System.out.println(" Enter your choice");

          n=sc.nextInt();

          switch(n) {
            case 1:System.out.println("Enter money to Withdraw");
            withdraw=sc.nextInt();
            if(bal>withdraw)
             {
              bal=bal-withdraw;
              System.out.println("Please collect your money");
             }
           else 
            System.out.println("Insufficient Balance");
            System.out.print(" ");
          break;

          case 2:System.out.println("Enter money to be deposit :");
          deposit = sc.nextInt();
          bal = bal+deposit;
          System.out.println("Your money is deposited");
          System.out.println(" ");
          break;

          case 3:System.out.println("bal=" + bal);
          System.out.println(" ");
          break;

          case 4:System.out.println("COntact to bank for details of transfer and payments :");
          break;

          case 5:System.exit(0);
          }
        }
        while(n!=5);
      } }
    

