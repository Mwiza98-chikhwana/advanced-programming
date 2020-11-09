import java.util.*;
public class BankAcc{
static ArrayList<AccDetails> mwiza = new ArrayList<>();    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // AccDetails n = new AccDetails();
        int choice = 0;
        System.out.println();
        System.out.println("welcome To Mwiza Bank");
        Date myDate = new Date();
         System.out.println();
          System.out.println("         Date:"+ myDate);
        System.out.println();
        System.out.println("                  Bank Management System");
        System.out.println();
             choice = 0;
        do{
            System.out.println("please enter the operation of your choice");
            System.out.println("1. List all accounts and their balances");
            System.out.println("2. create anew account");
            System.out.println("3. deposit mone into account");
            System.out.println("4. withdraw money from account");
            System.out.println("5. check balance");
            System.out.println("6. exit");

            System.out.println();
            //choice = Interger.parseInt(input.nextline());

            choice = Integer.parseInt(input.nextLine());
            switch (choice){
            case 1:System.out.println(" List all accounts and their balances");
                    for(int i = 0;i<mwiza.size();i++){
                        System.out.println(mwiza.get(i).toString());
                    }
            break;
            case 2:System.out.println(" create anew account");
            System.out.println("1. student");
            System.out.println("2. executive");
            int accType = 0; //
            
            accType = Integer.parseInt(input.nextLine());
            if (accType == 1){
                System.out.print("Enter name: ");
                String accountName = input.nextLine();
                System.out.println();
                System.out.print("Enter Account Number: ");
                int accountNumber = Integer.parseInt(input.nextLine());
                System.out.print("Enter branch name: ");
                String branch = input.nextLine();
                System.out.println("Enter Reg. No: ");
                String regNo = input.nextLine();
                Double balance = Double.parseDouble(input.nextLine());
                //AccDetails nick = new Student(accountNumber,accountName,regNo,branch,balance);
                mwiza.add(new Student(accountNumber,accountName,regNo,branch,balance));
                //nick.AccountClass();

            } 
            else if(accType == 2){
                System.out.println("enter name");
                String accountName = input.nextLine();
                System.out.println();
                System.out.println("enter your account number");
                int accountNumber = Integer.parseInt(input.nextLine());
                System.out.println();
                System.out.println("enter the branch name");
                String branch = input.nextLine();
                System.out.println();
                System.out.println("enter the book balance");
                double balance = Double.parseDouble(input.nextLine());
                //AccDetails nick2 = new Executive(accountName, accountNumber, branch, balance);
                mwiza.add(new Executive(accountName, accountNumber, branch, balance));
               // nick2.AccountClass();
                System.out.println("Executive Account created succesifully");
               // System.out.println("press any key to continue");
                System.out.println();

            }
            
            break;
            case 3:System.out.println(" deposit money into account\n 'should be greater than or equal to 200'");
                   double amount = input.nextDouble();
                   deposits();
  
            break;
            case 4:System.out.println(" withdraw money from account");
            
            break;
            case 5:System.out.println(" check balance");break;
            
            case 6:System.out.println(" exit");

        
        }
         
         
        }    while (choice != 6); 
    }  
        public static void deposits(){
                Scanner input = new Scanner(System.in);
                //n.deposit(amount);
                System.out.print("Enter Account Number: ");
                int accNo = Integer.parseInt(input.nextLine());

                for(int i=0; i<mwiza.size();i++){
                    if(accNo == mwiza.get(i).getAccountNumber()){
                        System.out.println("Account name is: "+ mwiza.get(i).getAccountName());
                        System.out.println("enter amount to deposit");
                        double amount = input.nextDouble();

                        mwiza.get(i).setDeposit(amount);
                        break;
                    }else{
                        if (mwiza.size()-1 == i)
                            System.out.println("Account not found");
                        else
                            continue;
                    }

                }
        }
         public static void withdrawals(AccDetails n){
              Scanner input = new Scanner(System.in);

              System.out.println("Enter account number");
              int accNo = Integer.parseInt(input.nextLine());
            System.out.println("how much do you you want to withdraw");
            double amount = input.nextDouble();

            for(int i=0; i<mwiza.size();i++){
                    if(accNo == mwiza.get(i).getAccountNumber()){
                        System.out.println("Account name is: "+ mwiza.get(i).getAccountName());
                        System.out.println("enter amount to withdraw");
                        amount = input.nextDouble();

                        mwiza.get(i).setWithdraw(amount);

                        break;
                    }
                    else{
                        if (mwiza.size()-1 == i)
                            System.out.println("Account not found");
                        else
                            continue;
                    }                    
            }
           // n.withdraw(amount);
         }
         public static void checkBalance(AccDetails n){
             Scanner input = new Scanner(System.in);

            System.out.print("Enter account Number: ");
            int accNo = Integer.parseInt(input.nextLine());

            for(int i=0; i<mwiza.size();i++){
                if(mwiza.get(i).getAccountNumber()==accNo){
                    System.out.println("Account Balance is: "+mwiza.get(i).getBookBalance());
                }
            }

       }
}
