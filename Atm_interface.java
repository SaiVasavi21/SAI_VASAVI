import java.util.*;
public class task3 {
    public static void  main(String args[])
    {
        int balance=5000,withdraw,deposite;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated teller machine");
            System.out.println("Choose 1 for withdraw");
             System.out.println("Choose 2 for Deposite");
              System.out.println("Choose 3 for Check Balance");
               System.out.println("Choose 4 for EXIT");
                System.out.println("Choose the operation you want to perform:");
                int n=sc.nextInt();
                switch(n)
                {
                    case 1:
                         System.out.println("Enetr money to be withdraw:");
                         withdraw=sc.nextInt();
                         if(balance>=withdraw)
                         {
                             balance=balance-withdraw;
                              System.out.println("Please collect your money");
                              
                         }
                         else
                         {
                              System.out.println("Insufficient Balance");
                         }
                          System.out.println(" ");
                          break;
                    case 2:
                        System.out.print("Eneter money to be depoosited:");
                        deposite=sc.nextInt();
                        balance=balance+deposite;
                         System.out.println("Your money has been successfully deposited");
                          System.out.println(" ");
                          break;
                    case 3:
                         System.out.println("Balance :"+balance);
                          System.out.println(" ");
                          break;
                    case 4:
                         System.exit(0);
                }
        }
    }}


