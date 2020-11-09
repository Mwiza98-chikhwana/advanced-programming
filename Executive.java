public class Executive extends AccDetails{
    
    public Executive(String accountName,int accountNumber,String branch, double balance){
        super(accountName, accountNumber, branch, balance);
    }
    /*@Override
    public void AccountClass(){
        System.out.println("your Account number is" + getAccountNumber());
        System.out.println();
        System.out.println("Enter account name");
        String accountName = inpu.nextLine();
        setAccountName(accountName);

        System.out.println("enter Branch");
        String Branch = inpu.nextLine();
        setBranch(branch);
        System.out.println();
        System.out.println("enter Bookbalance");
        double balance = inpu.nextDouble();
        setBalance(balance);
        System.out.println(""+accountName+" your Account was successfully created.");
    }*/
}