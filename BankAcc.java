import java.util.*;
public class BankAcc{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println();
        System.out.println("welcome To Mwiza Bank");
        Date myDate = new Date();
         System.out.println();
          System.out.println("         Date:"+ myDate);
        System.out.println();
        System.out.println("                  Bank Management System");
        System.out.println();
        do{
            System.out.println("please enter the operation of your choice");
            System.out.println("1. List all accounts and their balances");
            System.out.println("2. create anew account");
            System.out.println("3. deposit mone into account");
            System.out.println("4. withdraw money from account");
            System.out.println("5. check balance");
            System.out.println("6. exit");

            System.out.println();

            choice = input.nextInt();
            switch (choice){
            case 1:System.out.println(" List all accounts and their balances");
            break;
            case 2:System.out.println(" create anew account");
            System.out.println("1. executive");
            System.out.println("2. student");
            int accType = input.nextInt();
            if (accType == 1){
                System.out.println("enter your account number");
                int digit = input.nextInt();
            int accNumber = 0;

            System.out.println("enter accountname");
            String accName = input.nextLine();

            System.out.println("enter your branch");
            String branch = input.nextLine();

            } 
            
            break;
            case 3:System.out.println(" deposit mone into account\n 'should be greater than or equal to 200'");
            break;
            case 4:System.out.println(" withdraw money from account");break;
            case 5:System.out.println(" check balance");break;
            case 6:System.out.println(" exit");
            }
        
        }
          while (choice != 6);
              System.out.println("please try again");
    }
}